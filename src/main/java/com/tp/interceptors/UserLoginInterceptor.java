package com.tp.interceptors;

import com.tp.constants.LoginConstants;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * FileName: UserLoginInterceptor
 * Author:   TP
 * Date:     2020-01-09 15:36
 * Description:简易用户登录拦截器
 */
public class UserLoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!(handler instanceof HandlerMethod)) {
            return super.preHandle(request, response, handler);
        }
        //获取登陆人信息，userName系统唯一
        String userName = (String) request.getSession().getAttribute(LoginConstants.LOGIN_KEY);
        if (StringUtils.isEmpty(userName)) {
            //说明没有登录
            response.sendRedirect(request.getContextPath() + "/toLogin");
            return false;
        }
        return super.preHandle(request, response, handler);
    }


    /**
     * 判断是否为Ajax请求
     *
     * @param request HttpServletRequest
     * @return 是否为Ajax请求
     */
    private boolean isAjax(HttpServletRequest request) {
        if (null != request && null != request.getHeader("x-requested-with") &&
                request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")) {
            return true;
        }
        return false;
    }
}
