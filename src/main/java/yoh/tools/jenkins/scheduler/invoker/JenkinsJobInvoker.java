package yoh.tools.jenkins.scheduler.invoker;

import yoh.tools.jenkins.scheduler.JenkinsScheduleService;

/**
 * @author yohahn.kim
 * @since 5/28/14 10:09 PM
 */
public class JenkinsJobInvoker {

    private JenkinsScheduleService jenkinsScheduleService;

    public void setJenkinsScheduleService(JenkinsScheduleService jenkinsScheduleService) {
        this.jenkinsScheduleService = jenkinsScheduleService;
    }

    public void invoke(String dateTimeStr, String param1, String param2) {
        this.jenkinsScheduleService.scheduleRun(dateTimeStr, param1, param2);
    }
}
