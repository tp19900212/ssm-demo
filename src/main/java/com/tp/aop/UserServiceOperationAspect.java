package com.tp.aop;

import com.tp.models.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * FileName: UserServiceOperationAspect
 * Author:   TP
 * Date:     2019-11-04 12:51
 * Description:SpringAop-Service层切面测试
 */
@Slf4j
@Aspect
@Component
public class UserServiceOperationAspect {

    /**
     * 切点定义
     */
    @Pointcut("execution(* com.tp.service.IUserService.getById(..))")
    public void serviceGetById() {
    }

    /**
     * 测试service前置通知
     *
     * @param id 用户主键ID
     */
    @Before("serviceGetById() && args(id)")
    public void getUserBefore(Integer id) {
        log.info(">>>>AOP-Service：前置通知，请求参数id为{}", id);
    }

    /**
     * 测试service后置通知
     *
     * @param id 请求参数
     */
    @After("serviceGetById() && args(id)")
    public void getUserAfter(Integer id) {
        log.info(">>>>AOP-Service：后置通知，请求参数id为{}", id);
    }

    /**
     * 测试service返回通知
     *
     * @param id   主键ID
     * @param user 用户信息
     */
    @AfterReturning(pointcut = "serviceGetById() && args(id)", returning = "user")
    public void getUserAfterReturning(Integer id, User user) {
        log.info(">>>>AOP-Service：返回通知，请求参数id为{}，响应结果User信息为：{}", id, user);
    }

    /**
     * 测试service异常通知
     *
     * @param id 请求参数
     */
    @AfterThrowing(pointcut = "serviceGetById() && args(id)", throwing = "e")
    public void getUserAfterTrowing(Integer id, Exception e) {
        log.info(">>>>AOP-Service：异常通知，请求参数id为{}，异常信息：{}", id, e);
    }

    /**
     * 环绕通知
     *
     * @param proceedingJoinPoint proceedingJoinPoint
     */
    @Around("serviceGetById() && args(id)")
    public Object getUserAround(ProceedingJoinPoint proceedingJoinPoint, Integer id) {
        Object result = null;
        try {
            log.info(">>>>AOP-Service：环绕通知-开始，请求参数id为{}", id);
            result = proceedingJoinPoint.proceed();
            log.info(">>>>AOP-Service：环绕通知-结束，请求参数id为{}", id);
        }catch (Throwable e){
            log.info(">>>>AOP-Service：环绕通知，请求参数id为{}，执行失败，异常信息：", e);
        }
        return result;
    }

}
