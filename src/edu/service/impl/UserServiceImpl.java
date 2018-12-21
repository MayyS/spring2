package edu.service.impl;

import edu.dao.UserDao;
import edu.dao.impl.UserDaoimpl;
import edu.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {


    @Resource(name = "UserDao")
    UserDao userDao=new UserDaoimpl();

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void findById() {
        System.out.println("usersericeImpl findById-->");
        userDao.findById();
    }
}
