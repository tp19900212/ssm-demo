package com.tp.test.listener;

import com.tp.listeners.RobotListenerImpl;
import com.tp.models.entity.Robot;
import org.junit.Test;

/**
 * FileName: RobotListenerTest
 * Author:   TP
 * Date:     2020-01-08 23:01
 * Description:
 */
public class RobotListenerTest {

    @Test
    public void robotListenerTest() {
        Robot robot = new Robot();
        robot.registerListener(new RobotListenerImpl());
        robot.working();
        robot.dancing();
    }
}
