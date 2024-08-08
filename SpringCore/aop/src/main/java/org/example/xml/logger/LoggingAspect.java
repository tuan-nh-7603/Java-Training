package org.example.xml.logger;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect {
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Executing method: " + joinPoint.getSignature().getName());
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println("Argument: " + arg);
        }
    }

    public void logAfter(JoinPoint joinPoint) {
        System.out.println("Completed method: " + joinPoint.getSignature().getName());
    }
}
