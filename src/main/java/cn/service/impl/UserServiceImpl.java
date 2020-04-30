package cn.service.impl;

import cn.dao.UserDao;
import cn.domain.User;
import cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 登录业务层实现类
 * */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @Override
    public User checkLogin(String username, String password) {
        User user = userDao.findByUsername(username);
        if (user != null && user.getPassword().equals(password)){
            return user;
        }
        return null;
    }

    @Override
    public void Regist(User user) {

        userDao.registerByUsernameAndPassword(user.getUsername(),user.getPassword());
    }
}
