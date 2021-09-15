package com.zds;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author zhongdongsheng
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println("Provider started...");
        //System.in.read();
    }
}
