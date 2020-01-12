package com.tp.listeners;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * FileName: MyHttpSessionListener
 * Author:   TP
 * Date:     2020-01-09 08:47
 * Description:MyHttpSessionListener类实现了HttpSessionListener接口，
 *             因此可以对HttpSession对象的创建和销毁这两个动作进行监听。
 */
public class MyHttpSessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println(httpSessionEvent.getSession() + "创建了！！");
    }

    /*
    HttpSession的销毁时机需要在web.xml中进行配置，如下：
    <session-config>
        <session-timeout>1</session-timeout>
    </session-config>
    这样配置就表示session在1分钟之后就被销毁
    */
    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("session销毁了！！");
    }
}
