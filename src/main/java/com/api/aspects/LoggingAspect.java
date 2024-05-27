package com.api.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * * Author: Francisco Hernandez
 **/
@Aspect
@Component
public class LoggingAspect {
    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.api.controller.SpaceCraftController.getSpaceCraftById(..))")
    public void logGetAllSpaceCraft(JoinPoint joinPoint) {
        logger.debug("getSpaceCraftById: {}", joinPoint.getTarget().getClass().getSimpleName());
    }

}
