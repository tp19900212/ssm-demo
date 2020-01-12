package com.tp.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * FileName: MyServletContextListener
 * Author:   TP
 * Date:     2020-01-08 23:44
 * Description:MyServletContextListener类实现了ServletContextListener接口，
 *             因此可以对ServletContext对象的创建和销毁这两个动作进行监听。
 */
public class MyServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext对象创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext对象销毁");
    }
}
