/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.vertexprize.git.connector.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.CamelContext;
import org.apache.camel.spring.boot.CamelContextConfiguration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 *
 * @author HP
 */
@Component
@Slf4j
public class CamelCfg {

    @Autowired
    CamelContext camelContext;

//    @Bean
//    @BindToRegistry("eventBus")
//    EventBus createBus() {
//        EventBus eventBus = new EventBus();
//        return eventBus;
//    }
    // Фабрика бинов
    @Autowired
    BeanFactory beanFactory;

    @Bean
    public CamelContextConfiguration contextConfiguration() {
        return new CamelContextConfiguration() {
            
            @Override
            public void beforeApplicationStart(CamelContext context) {
                log.info("Настройка компонентов Camel перед запуском...");
            }
            @Override
            public void afterApplicationStart(CamelContext context) {
                log.info("Настройка компонентов Camel после запуска...");
            }
        };
    }
}
