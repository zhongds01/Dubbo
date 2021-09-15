package com.zds.service.impl;

import com.zds.service.DemoService;

/**
 * @author zhongdongsheng
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello:" + name;
    }
}
