package com.tp.aop;

import com.tp.models.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * FileName: UserOperationAspect
 * Author:   TP
 * Date:     2019-11-04 12:51
 * Description:SpringAop测试
 */
@Slf4j
@Aspect
@Component
public class UserOperationAspect {

    //测试UserService中的切点
    @Pointcut("execution(* com.tp.service.IUserService.getById(..))")
    public void serviceGetById() {
    }

    //测试UserController中的切点
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
        log.info(">>>>织入Controller：前置通知，请求参数id为{}", id);
    }

    /**
     * 测试service请求前通知
     *
     * @param id 用户主键ID
     */
    @Before("serviceGetById() && args(id)")
    public void getUserBefore(Integer id) {
        log.info(">>>>织入Service：前置通知，请求参数id为{}", id);
    }

    /**
     * 测试service返回后通知
     *
     * @param id   主键ID
     * @param user 用户信息
     */
    @AfterReturning(pointcut = "serviceGetById() && args(id)", returning = "user")
    public void getUserAfterReturning(Integer id, User user) {
        log.info(">>>>织入Service：返回通知，请求参数id为{}，响应结果User信息为：{}", id, user);
    }
}
