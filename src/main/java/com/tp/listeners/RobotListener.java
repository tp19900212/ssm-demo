package com.tp.listeners;

import com.tp.event.RobotEvent;

/**
 * FileName: RobotListener
 * Author:   TP
 * Date:     2020-01-08 22:50
 * Description:机器人事件监听器
 */
public interface RobotListener {

    /**
     * 监听工作
     * @param robotEvent 事件对象
     */
    void working(RobotEvent robotEvent);

    /**
     * 监听跳舞
     * @param robotEvent 事件对象
     */
    void dancing(RobotEvent robotEvent);
}