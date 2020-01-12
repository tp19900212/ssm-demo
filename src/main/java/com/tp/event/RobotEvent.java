package com.tp.event;

import com.tp.models.entity.Robot;

/**
 * FileName: RobotEvent
 * Author:   TP
 * Date:     2020-01-08 22:51
 * Description:事件对象
 */
public class RobotEvent {

    private Robot robot;

    public RobotEvent() {
        super();
    }

    public RobotEvent(Robot robot) {
        super();
        this.robot = robot;
    }


    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }
}