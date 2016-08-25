package onlyfun.caterpillar;

public class DemoJob {
    private JobData jobData;
    
    public void execute() {
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
