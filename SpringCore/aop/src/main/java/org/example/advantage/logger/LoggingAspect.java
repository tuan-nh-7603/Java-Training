package org.example.advantage.logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Aspect
@Component
public class LoggingAspect {
//    @Before("execution(public * org.example.advantage.service.*.*(..))")
//    public void logBefore(JoinPoint joinPoint) {
//        System.out.println("Executing method: " + joinPoint.getSignature().getName());
//        Object[] args = joinPoint.getArgs();
//        for (Object arg : args) {
//            System.out.println("Argument: " + arg);
//        }
//    }
//
//    @Pointcut("execution(* org.example.advantage.service.AccountService.deposit(..))")
//    public void transferMethod() {}
//
//    @Before("transferMethod()")
//    public void logBeforeTransfer(JoinPoint joinPoint) {
//        System.out.println("<Log by execution> Executing transfer method: " + joinPoint.getSignature().getName());
//        Object[] args = joinPoint.getArgs();
//        for (Object arg : args) {
//            System.out.println("Argument: " + arg);
//        }
//    }
//
//    @Pointcut("within(org.example.advantage.service.AccountService)")
//    public void withinAccountService() {
//
//    }
//    @Before("withinAccountService()")
//    public void logBeforeMethodsInAccountService(JoinPoint joinPoint) {
//        System.out.println("<Log by within> Executing method in AccountService: " + joinPoint.getSignature().getName());
//        Object[] args = joinPoint.getArgs();
//        for (Object arg : args) {
//            System.out.println("Argument: " + arg);
//        }
//    }

    @Pointcut("execution(* org.example.advantage.service.AccountService.deposit(..))")
    public void serviceMethods() {}

    @Before("serviceMethods()")
    public void logBeforeServiceMethod(JoinPoint joinPoint) {
        System.out.println("<execution> Executing method: " + joinPoint.getSignature().getName());
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println("Argument: " + arg);
        }
    }

    // Pointcut cho tất cả các phương thức trong package org.example.advantage.service và các sub-package của nó
    @Pointcut("within(org.example.advantage.service..*)")
    public void serviceLayer() {}

    @After("serviceLayer()")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("<within> Completed method: " + joinPoint.getSignature().getName());
    }

    // Pointcut cho tất cả các phương thức trong các bean có kiểu là AccountService
    @Pointcut("target(org.example.advantage.service.AccountService)")
    public void accountServiceMethods() {}

    @AfterThrowing(pointcut = "accountServiceMethods()", throwing = "error")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
        System.out.println("<target> Method threw exception: " + error);
    }

    // Pointcut cho tất cả các phương thức có tham số cuoi cung là kiểu String
    @Pointcut("args(..,java.lang.String)")
    public void methodsWithStringArg() {}

    @Around("methodsWithStringArg()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("<around> Around before: " + joinPoint.getSignature().getName());
        Object result = joinPoint.proceed();
        System.out.println("<around> Around after: " + joinPoint.getSignature().getName());
        return result;
    }

    // Pointcut cho tất cả các phương thức được chú thích với @Transactional
    @Pointcut("@annotation(javax.transaction.Transactional)")
    public void transactionalMethods() {}

    @AfterReturning(pointcut = "transactionalMethods()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("<annotation> Method returned: " + result);
    }

}
