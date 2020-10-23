package com.spring.service;

import com.spring.dao.UserDao;
import com.spring.dao.UserDaoMysqlImpl;
import com.spring.dao.UserDaoOracleImpl;

/**
 * @author When all else is lost the future still remains.
 * @date 2020/10/14 - 10:44
 **/
public class UserServiceImpl implements UserService {

    //利用set方法动态实现值注入
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {

        userDao.getUser();
    }
}
