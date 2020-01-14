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
 * FileName: CustomizePropertyPlaceholderConfigurer
 * Author: TP
 * Create Date: 2019-12-11 23:38
 * Description:属性文件配置类，用于加载系统中使用的.properties文件
 * 覆盖了spring的PropertyPlaceholderConfigurer类，主要目的就是为了
 * 可以在代码中直接调用getContextProperty获取属于文件中对应的配置信息
 */
public class CustomizePropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    private static Map<String, Object> ctxPropertiesMap;

    @Override
    protected void processProperties(
            ConfigurableListableBeanFactory beanFactoryToProcess,
            Properties props) throws BeansException {

        super.processProperties(beanFactoryToProcess, props);
        //load properties to ctxPropertiesMap
        ctxPropertiesMap = new HashMap<>();
        for (Object key : props.keySet()) {
            String keyStr = key.toString();
            String value = props.getProperty(keyStr);
            ctxPropertiesMap.put(keyStr, value);
        }
    }

    /**
     * 根据属性名称key获取属性值value
     *
     * @param name 属性名称
     * @return 属性值
     */
    public static Object getContextProperty(String name) {
        return ctxPropertiesMap.get(name);
    }


    /**
     * 根据属性值value获取属性名称key
     *
     * @param value 属性值
     * @return 属性名称
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
