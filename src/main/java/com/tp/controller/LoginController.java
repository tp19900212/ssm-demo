package com.tp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * FileName: LoginController
 * Author:   TP
 * Date:     2020-01-09 17:18
 * Description:用户登录控制器
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

}
