package test;

import edu.service.UserService;
import edu.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

    public static void main(String[] args){
        String path="applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(path);
        UserService userService=applicationContext.getBean("UserService", UserServiceImpl.class);
        userService.findById();

    }



}
