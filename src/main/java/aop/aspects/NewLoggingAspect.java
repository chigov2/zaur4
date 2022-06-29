package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(* returnBook())")
    public Object aroundReturnBook(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBook -> в библиотеку пытаются вернуть книгу");

        Object targetMethodResult = proceedingJoinPoint.proceed();

        System.out.println("aroundReturnBook -> в библиотеку вернули книгу");

        return targetMethodResult;

    }
}
