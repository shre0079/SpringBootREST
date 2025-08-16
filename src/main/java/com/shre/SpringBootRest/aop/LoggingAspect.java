package com.shre.SpringBootRest.aop;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingAspect {

    private static final Logger log = LoggerFactory.getLogger(LogginAspect.class);

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
