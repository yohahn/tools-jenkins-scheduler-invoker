package yoh.tools.jenkins.scheduler;

/**
 * @author yohahn.kim
 * @since 5/28/14 9:52 PM
 */
public interface JenkinsScheduleService {

    void scheduleRun(String dateTime, String param1, String param2);
}
