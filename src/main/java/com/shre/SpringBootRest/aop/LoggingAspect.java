package com.shre.SpringBootRest.aop;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingAspect {

    private static final Logger log = LoggerFactory.getLogger(LogginAspect.class);

    public void logMethodCall(){
        log.info("Method called");
    }
}
