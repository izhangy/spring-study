package com.spring.dao;

/**
 * @author When all else is lost the future still remains.
 * @date 2020/10/14 - 10:52
 **/
public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("Mysql获取用户数据");
    }
}
