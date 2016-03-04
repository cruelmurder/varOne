/**
 * 
 */
package com.varone.web.deploy.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.yarn.api.records.ApplicationReport;
import org.apache.hadoop.yarn.api.records.YarnApplicationState;
import org.apache.hadoop.yarn.client.api.YarnClient;
import org.apache.hadoop.yarn.conf.YarnConfiguration;
import org.apache.hadoop.yarn.exceptions.YarnException;

/**
 * @author allen
 *
 */
public class YarnService extends AbstractDeployModeService{
	
	private YarnClient yarnClient;
	
	
	public YarnService(Configuration config){
		YarnConfiguration conf = new YarnConfiguration(config);
		this.yarnClient = YarnClient.createYarnClient();
		this.yarnClient.init(conf);
		this.yarnClient.start();
	}
	
	@Override
	public List<String> getRunningSparkApplications() throws YarnException, IOException{
		List<String> applicationIds = new ArrayList<String>();
		for(ApplicationReport report : this.yarnClient.getApplications()){
			if(report.getApplicationType().equals("SPARK") && report.getYarnApplicationState().name().equals("RUNNING")){
				applicationIds.add(report.getApplicationId().toString());
			}
		}
		return applicationIds;
	}
	
	@Override
	public boolean isStartRunningSparkApplication(String applicationId) throws YarnException, IOException{
		boolean valid = false;
		for(ApplicationReport report : this.yarnClient.getApplications()){
			if(report.getApplicationType().equals("SPARK") && report.getApplicationId().toString().equals(applicationId)){
				if(report.getYarnApplicationState().equals(YarnApplicationState.RUNNING) || 
						report.getYarnApplicationState().equals(YarnApplicationState.FINISHED)){
					valid = true;
				}
				break;
			}
		}
		return valid;
	}

	@Override
	public List<String> getSparkApplicationsByPeriod(long start, long end) throws YarnException, IOException {
		List<String> applicationIds = new ArrayList<String>();
		for(ApplicationReport report : this.yarnClient.getApplications()){
			if(report.getApplicationType().equals("SPARK")){
				if((start <= report.getStartTime() && report.getStartTime() <= end) || 
						(start <= report.getFinishTime() && report.getFinishTime() <= end)){
					applicationIds.add(report.getApplicationId().toString());
				}
			}
		}
		return applicationIds;
	}
	
	@Override
	public void close() throws IOException {
		this.yarnClient.close();
	}
}