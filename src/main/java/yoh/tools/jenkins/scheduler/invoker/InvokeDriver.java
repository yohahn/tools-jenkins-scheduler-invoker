package yoh.tools.jenkins.scheduler.invoker;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yohahn.kim
 * @since 5/28/14 10:14 PM
 */
public class InvokeDriver {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        JenkinsJobInvoker jenkinsJobInvoker = context.getBean("jenkinsJobInvoker", JenkinsJobInvoker.class);

        jenkinsJobInvoker.invoke(args[0], args[1], args[2]);
    }
}
