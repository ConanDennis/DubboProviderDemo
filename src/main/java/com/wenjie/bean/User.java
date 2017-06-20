package com.wenjie.bean;

import java.io.Serializable;

/**
 * Created by wenjie.zhou on 2017/6/20.
 */
public class User implements Serializable{

    private static final long serialVersionUID = 1546146768019924700L;

    String name ;
    int age ;
    String sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
