package com.tp.controller;

import com.tp.common.ReturnT;
import com.tp.models.entity.User;
import com.tp.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * FileName: UserController
 * Author:   TP
 * Date:     2020-01-10 14:13
 * Description:用户管理控制器
 */
@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping("getUser")
    public ReturnT getUser(Integer id) {
        User user = userService.getById(id);
        if (null != user) {
            return new ReturnT(user);
        }
        return new ReturnT(ReturnT.FAIL_CODE, "查无此数据");
    }

    @ResponseBody
    @RequestMapping("/saveUser")
    public ReturnT saveUser(User user) {
        log.info(">>>>请求进入UserController.saveUser，请求参数user:{}", user);
        int result = userService.saveUser(user);
        if (result > 0) {
            return ReturnT.SUCCESS;
        }
        return ReturnT.FAIL;
    }
}
