package com.wenjie.dubboserver;

import com.wenjie.bean.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenjie.zhou on 2017/6/19.
 */
public class HelloWorld implements HelloWorldInterface{
    public String sayHello(String name) {
        name = "Hello" + name + "测试";
        return name;

    }

    public List<User> getUsers() {
        List<User> list  =  new ArrayList();
        User u1  =  new  User();
        u1.setName("jack");
        u1.setAge(20);
        u1.setSex("男");

        User u2  =  new  User();
        u2.setName("tom");
        u2.setAge(21);
        u2.setSex("女");

        User u3  =  new  User();
        u3.setName("rose");
        u3.setAge(19);
        u3.setSex("女");

        list.add(u1);
        list.add(u2);
        list.add(u3);
        return list;
    }
}