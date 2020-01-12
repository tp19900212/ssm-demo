package com.tp.models.entity;

import com.tp.event.RobotEvent;
import com.tp.listeners.RobotListener;

/**
 * FileName: Robot
 * Author:   TP
 * Date:     2020-01-08 22:49
 * Description:事件源：机器人
 */
public class Robot {

    private RobotListener listener;

    /**
     * 注册机器人监听器
     *
     * @param listener 机器人监听器
     */
    public void registerListener(RobotListener listener) {
        this.listener = listener;
    }

    /**
     * 工作
     */
    public void working() {
        if (listener != null) {
            RobotEvent robotEvent = new RobotEvent(this);
            this.listener.working(robotEvent);
        }
        System.out.println("机器人开始工作......");
    }

    /**
     * 跳舞
     */
    public void dancing() {
        if (listener != null) {
            RobotEvent robotEvent = new RobotEvent(this);
            this.listener.dancing(robotEvent);
        }
        System.out.println("机器人开始跳舞......");
    }
}
