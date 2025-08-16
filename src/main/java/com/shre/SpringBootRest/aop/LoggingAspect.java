package com.shre.SpringBootRest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    //return type, class name, method name, args
    @Before("execution(* com.shre.SpringBootRest.service.JobService.getJob(..)) || execution(* com.shre.SpringBootRest.service.JobService.updateJob(..))")
    public void logMethodCall(JoinPoint joinPoint) {
        logger.info("Method called "+joinPoint.getSignature().getName());
    }

    @After("execution(* com.shre.SpringBootRest.service.JobService.getJob(..)) || execution(* com.shre.SpringBootRest.service.JobService.updateJob(..))")
    public void logMethodExecuted(JoinPoint joinPoint) {
        logger.info("Method Executed "+joinPoint.getSignature().getName());
    }

    @AfterThrowing("execution(* com.shre.SpringBootRest.service.JobService.getJob(..)) || execution(* com.shre.SpringBootRest.service.JobService.updateJob(..))")
    public void logMethodCrash(JoinPoint joinPoint) {
        logger.info("Method has some issues "+joinPoint.getSignature().getName());
    }

    @AfterReturning("execution(* com.shre.SpringBootRest.service.JobService.getJob(..)) || execution(* com.shre.SpringBootRest.service.JobService.updateJob(..))")
    public void logMethodExecutedSuccessfully(JoinPoint joinPoint) {
        logger.info("Method executed successfully "+joinPoint.getSignature().getName());
    }
}
