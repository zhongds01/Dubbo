package com.zds;

import com.zds.service.NameService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhongdongsheng
 */
public class MainApplication {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");
        ioc.start();
        NameService nameService = (NameService)ioc.getBean("nameServiceImpl");
        nameService.sayName();
        System.out.println("调用完成");
        //System.in.read();
    }
}
