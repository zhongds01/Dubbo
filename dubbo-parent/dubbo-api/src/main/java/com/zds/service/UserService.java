package com.zds.service;

import com.zds.bean.User;

import java.util.List;

/**
 * @author zhongdongsheng
 */
public interface UserService {
    /**
     * 获取用户信息
     *
     * @return List<User>
     */
    List<User> getUser();
}
