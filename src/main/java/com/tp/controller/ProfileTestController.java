package com.tp.controller;

import com.tp.common.CustomizePropertyPlaceholderConfigurer;
import com.tp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * FileName: ProfileTestController
 * Author:   TP
 * Date:     2020-01-12 00:23
 * Description:
 */
@Controller
@ResponseBody
@RequestMapping("/profile")
public class ProfileTestController {

    @Autowired
    private IUserService userService;

    @Value("${app.active.env}")
    private String env;

    @RequestMapping("/getActiveEnv")
    public String getActiveEnv() {
        System.out.println("UserServiceImpl中获取的的环境信息：" + userService.getEnv());
        System.out.println("自定义配置文件读取工具获取的环境信息：" +
                CustomizePropertyPlaceholderConfigurer.getContextProperty("app.active.env"));
        System.out.println("ProfileTestController中获取的环境信息：" + env);
        return env;
    }

}
