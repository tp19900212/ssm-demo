package com.tp.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * FileName: BaseTestCase
 * Author:   TP
 * Date:     2020-01-10 17:48
 * Description:BaseTestCase继承了AbstractJUnit4SpringContextTests类
 * 而AbstractJUnit4SpringContextTests类实现了ApplicationContextAware接口并且提供了applicationContext成员变量
 * 所以在测试类中如果需要使用spring应用上下文，就可以直接使用applicationContext.xxx()方法
 */
//指定测试用例的运行器 这里是指定了Junit4
@RunWith(SpringJUnit4ClassRunner.class)
//指定Spring的配置文件 /为classpath下
@ContextConfiguration(locations = {"classpath:config/*.xml"})
public class BaseTestCase extends AbstractJUnit4SpringContextTests {
}
