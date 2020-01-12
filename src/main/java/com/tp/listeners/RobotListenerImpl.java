package com.tp.listeners;

import com.tp.event.RobotEvent;
import com.tp.models.entity.Robot;

/**
 * FileName: RobotListenerImpl
 * Author:   TP
 * Date:     2020-01-08 22:56
 * Description:
 */
public class RobotListenerImpl implements RobotListener {

    @Override
    public void working(RobotEvent robotEvent) {
        Robot robot = robotEvent.getRobot();
        System.out.println("机器人工作提示：您的机器人已经开始工作啦！");
    }

    @Override
    public void dancing(RobotEvent robotEvent) {
        Robot robot = robotEvent.getRobot();
        System.out.println("机器人跳舞提示：您的机器人已经开始跳舞啦！");
    }
}
