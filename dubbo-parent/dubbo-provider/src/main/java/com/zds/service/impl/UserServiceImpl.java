package com.zds.service.impl;

import com.zds.bean.User;
import com.zds.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhongdongsheng
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUser() {
        List<User> userList = new ArrayList<User>();
        userList.add(new User("Tom"));
        userList.add(new User("Tony"));
        userList.add(new User("Jack"));
        return userList;
    }
}
