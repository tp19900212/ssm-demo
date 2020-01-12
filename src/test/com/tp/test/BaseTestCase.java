package com.tp.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by TP on 2018/04/25.
 */
//指定测试用例的运行器 这里是指定了Junit4
@RunWith(SpringJUnit4ClassRunner.class)
//指定Spring的配置文件 /为classpath下
@ContextConfiguration(locations = {"classpath:config/*.xml"})
public class BaseTestCase {
}
