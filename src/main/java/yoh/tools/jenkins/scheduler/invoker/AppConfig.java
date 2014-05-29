package yoh.tools.jenkins.scheduler.invoker;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import yoh.tools.jenkins.scheduler.JenkinsScheduleService;

/**
 * @author yohahn.kim
 * @since 5/28/14 10:09 PM
 */
@Configuration
public class AppConfig {

    @Bean
    public RmiProxyFactoryBean jenkinsScheduleService() {
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceUrl("rmi://localhost:1199/JenkinsScheduleService");
        rmiProxyFactoryBean.setServiceInterface(JenkinsScheduleService.class);
        return rmiProxyFactoryBean;
    }

    @Bean
    public JenkinsJobInvoker jenkinsJobInvoker() {
        JenkinsJobInvoker jenkinsJobInvoker = new JenkinsJobInvoker();
        jenkinsJobInvoker.setJenkinsScheduleService((JenkinsScheduleService) jenkinsScheduleService().getObject());
        return jenkinsJobInvoker;
    }
}
