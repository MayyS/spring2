package edu.dao.impl;

import edu.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public class UserDaoimpl implements UserDao {

    @Override
    public void findById() {
        System.out.println("userdaoImpl-->userdao find");
    }
}
