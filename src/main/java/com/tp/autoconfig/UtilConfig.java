package com.tp.autoconfig;

import com.tp.utils.SpringContextHolder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FileName: UtilConfig
 * Author:   TP
 * Date:     2019-12-11 23:38
 * Description:
 */
@Configuration
public class UtilConfig {

    @Bean
    public SpringContextHolder springContextHolder() {
        return new SpringContextHolder();
    }
}
