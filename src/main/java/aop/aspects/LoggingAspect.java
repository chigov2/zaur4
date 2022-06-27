package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
//@EnableAspectJAutoProxy
@Aspect
public class LoggingAspect {

    @Before("execution(public void getBook())")
    public void loggingBeforeAdvice(){
        System.out.println("loggingBeforeAdvice: Попытка получить книгу");
    }
}
