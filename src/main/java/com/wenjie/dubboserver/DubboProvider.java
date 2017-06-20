package com.wenjie.dubboserver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by wenjie.zhou on 2017/6/19.
 */
public class DubboProvider {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationProvider.xml" });
        context.start();
        System.out.println("服务请求中，按任意键退出");
        System.in.read();
    }
}
