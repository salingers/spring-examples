package onlyfun.caterpillar;

import org.quartz.JobExecutionContext;
import org.springframework.scheduling.
                           quartz.QuartzJobBean;

public class DemoJob extends QuartzJobBean {
    private JobData jobData;
    
    public void executeInternal(
                  JobExecutionContext context) {
        System.out.println(
                jobData.getData() + " is executed.");
    }
    
    public void setJobData(JobData jobData) {
        this.jobData = jobData;
    }
    
    public JobData getJobData() {
        return jobData;
    }
} 
