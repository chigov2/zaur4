package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* get*(..))")
    private void allGetMethods(){

    }

    @Before("allGetMethods()")
    public void BeforeGetLoggingAdvice(){

        System.out.println("BeforeGetLoggingAdvice -> Попытка получить книгу или журнал");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice -> Проверка прав на получение книги или журнала");
    }

//    @Before("execution(public void return*())")
//    public void loggingBeforeReturnAdvice(){
//
//        System.out.println("loggingBeforeReturnAdvice: Попытка вернуть книгу");
//    }
}
