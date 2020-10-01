package session7.workshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("start");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Bean1 bean1 = (Bean1) applicationContext.getBean("Bean1");

    }
}
