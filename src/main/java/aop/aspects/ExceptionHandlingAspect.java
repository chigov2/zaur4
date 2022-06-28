package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(300)
public class ExceptionHandlingAspect {

    @Before("aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeExceptionHandlingAdvice(){
        System.out.println("Ловим исключения при попытке получить книгу или журнал");
        System.out.println("--------------------------------------------");
    }
}
