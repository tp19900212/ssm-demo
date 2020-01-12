package com.tp.listeners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * FileName: MyServletRequestListener
 * Author:   TP
 * Date:     2020-01-09 09:14
 * Description: MyServletRequestListener类实现了ServletRequestListener接口，
 *              因此可以对ServletRequest对象的创建和销毁这两个动作进行监听。
 */
public class MyServletRequestListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println(sre.getServletRequest() + "销毁了！！");

    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println(sre.getServletRequest() + "创建了！！");
    }
}
