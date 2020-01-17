package com.tp.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * FileName: UserControllerOperationAspect
 * Author:   TP
 * Date:     2019-11-04 12:51
 * Description:SpringAop-Controller层切面测试
 */
@Slf4j
@Aspect
@Component
public class UserControllerOperationAspect {

    /**
     * 切点定义
     */
    @Pointcut("execution(* com.tp.controller.UserController.getUser(..))")
    public void getUser() {
    }

    /**
     * 测试controller请求前
     *
     * @param id 用户主键ID
     */
    @Before("getUser() && args(id)")
    public void controllerGetUser(Integer id) {
        log.info(">>>>AOP-Controller：前置通知，请求参数id为{}", id);
    }

}
