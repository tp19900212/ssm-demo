package com.tp.test.service;

import com.alibaba.fastjson.JSON;
import com.tp.models.entity.User;
import com.tp.service.IUserService;
import com.tp.test.BaseTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * FileName: UserServiceTest
 * Author:   TP
 * Date:     2020-01-10 17:48
 * Description:
 */
public class UserServiceTest extends BaseTestCase {

    @Autowired
    private IUserService userService;

    @Test
    public void testGetUserById() {
        Integer id = 1;
        User user = userService.getById(id);
        System.out.println(">>>>>>" + JSON.toJSONString(user));
    }
}
