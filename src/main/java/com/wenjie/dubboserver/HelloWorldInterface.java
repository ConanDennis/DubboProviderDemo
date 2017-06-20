package com.wenjie.dubboserver;

import com.wenjie.bean.User;

import java.util.List;

/**
 * Created by wenjie.zhou on 2017/6/19.
 */
public interface HelloWorldInterface {

    public String sayHello(String name);

    public List<User> getUsers();
}
