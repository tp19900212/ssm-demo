package com.tp.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

/**
 * FileName: Bird
 * Author:   TP
 * Date:     2020-01-09 11:16
 * Description:测试HttpSessionActivationListener用的JavaBean
 */
@Data
@AllArgsConstructor
public class Bird implements HttpSessionActivationListener, Serializable {
    private static final long serialVersionUID = 7589841135210272124L;
    private String name;

    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println(name + "和session一起被序列化(钝化)到硬盘了，session的id是：" + se.getSession().getId());
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println(name + "和session一起从硬盘反序列化(活化)回到内存了，session的id是：" + se.getSession().getId());
    }
}
