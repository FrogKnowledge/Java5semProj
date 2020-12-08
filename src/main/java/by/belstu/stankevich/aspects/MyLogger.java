package by.belstu.stankevich.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLogger {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Pointcut("execution (* by.belstu.stankevich.controllers.AdminController.getAllUsers(..))")
    private void someOperation() {}

    @Before("someOperation()")
    public void process() {
        log.info("Client want to get all users");
    }
}