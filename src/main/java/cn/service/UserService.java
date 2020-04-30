package cn.service;

import cn.domain.User;

/**
 * 登录业务层接口
 * */
public interface UserService {

    User checkLogin(String username,String password);
    void Regist(User user);
}
