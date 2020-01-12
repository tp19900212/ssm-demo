package com.tp.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * FileName: Cat
 * Author:   TP
 * Date:     2020-01-09 10:52
 * Description: 用于测试HttpSessionBindingListener的JavaBean
 */
@Data
@AllArgsConstructor
public class Cat implements HttpSessionBindingListener {

    private String name;

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println(String.format("%s被加入到session中了", name));
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println(String.format("%s从session中被移除了", name));
    }
}