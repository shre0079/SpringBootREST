package com.shre.SpringBootRest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMonitorAspect {

    public static final Logger logger= LoggerFactory.getLogger(PerformanceMonitorAspect.class);

    @Around("execution (* com.shre.SpringBootRest.service.JobService.*(..))")
    public Object monitorTime(ProceedingJoinPoint jp) throws Throwable {

        long start=System.currentTimeMillis();

        Object obj= jp.proceed();
        long end=System.currentTimeMillis();

        if (logger.isInfoEnabled())
            logger.info("Time taken by: {} {} ms", jp.getSignature().getName(), end - start);
        return obj;
    }
}
