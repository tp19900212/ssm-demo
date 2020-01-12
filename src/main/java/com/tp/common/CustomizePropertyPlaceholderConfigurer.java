package com.tp.common;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Description: 属性文件配置类，用与加载系统中使用的.properties文件，
 * 覆盖了spring的PropertyPlaceholderConfigurer类，主要目的就是为了
 * 可以在代码中直接调用getContextProperty获取属于文件中对应的配置信息
 * Author: TP
 * Project: ssmdemo
 * Version: V1.0
 * Create Date: 16/2/25
 */
public class CustomizePropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    private static Map<String, Object> ctxPropertiesMap;

    @Override
    protected void processProperties(
            ConfigurableListableBeanFactory beanFactoryToProcess,
            Properties props) throws BeansException {

        super.processProperties(beanFactoryToProcess, props);
        //load properties to ctxPropertiesMap
        ctxPropertiesMap = new HashMap<String, Object>();
        for (Object key : props.keySet()) {
            String keyStr = key.toString();
            String value = props.getProperty(keyStr);
            ctxPropertiesMap.put(keyStr, value);
        }
    }

    /**
     * static method for accessing context properties
     *
     * @param name
     * @return
     */
    public static Object getContextProperty(String name) {
        return ctxPropertiesMap.get(name);
    }


    /**
     * 根据value,取得key
     */
    public static List<String> getContextKey(Object value) {
        List<String> keys = new ArrayList<>();
        for (String key : ctxPropertiesMap.keySet()) {
            if (value.equals(ctxPropertiesMap.get(key))) {
                keys.add(key);
            }
        }
        return keys;
    }
}
