package com.tp.filters;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * FileName: CharacterEncodingFilter
 * Author:   TP
 * Date:     2019-12-20 14:13
 * Description:全局乱码处理过滤器
 */
public class DemoFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        //得到过滤器的初始化配置信息
        System.out.println(">>>>开始初始化DemoFilter");
    }

    public void doFilter(ServletRequest req, ServletResponse resp,
                         FilterChain chain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        System.out.println("----调用service之前执行一段代码----");
        chain.doFilter(request, response);
        System.out.println("----调用service之后执行一段代码----");
    }

    public void destroy() {
        System.out.println(">>>>销毁初始化DemoFilter");
    }
}
