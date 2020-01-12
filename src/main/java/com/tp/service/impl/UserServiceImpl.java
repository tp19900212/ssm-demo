package com.tp.service.impl;

import com.tp.mapper.UserMapper;
import com.tp.models.entity.User;
import com.tp.service.IUserService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * FileName: UserServiceImpl
 * Author:   TP
 * Date:     2020-01-10 14:10
 * Description:
 */
@Service
public class UserServiceImpl implements IUserService {

    @Getter
    @Setter
    @Value("${app.active.env}")
    private String env;

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(Integer id) {
        if (null != id && id > 0) {
            return userMapper.getById(id);
        }
        return null;
    }

    @Override
    @Transactional
    public int saveUser(User user) {
        if (null != user) {
            user.setCreateTime(new Date());
            int i = userMapper.saveUser(user);
            // 测试Spring事物事物
            // i = 2/0;
            return i;
        }
        return 0;
    }

    @Override
    public String getEnv() {
        return env;
    }
}
