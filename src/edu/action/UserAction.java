package edu.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import edu.entity.User;
import edu.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;



@Controller("userAction")
@Scope("session")
public class UserAction extends ActionSupport implements ModelDriven<User> {

    private User user=new User();

    @Resource(name = "UserService")
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public User getModel() {
        return user;
    }

    public String login(){

        System.out.println(this.hashCode());

        if("abcd".equals(user.getUsername())&&"1234".equals(user.getPassword())){
            System.out.println("Ok");
            return "success";
        }else{
            return "fail";
        }
    }
}
