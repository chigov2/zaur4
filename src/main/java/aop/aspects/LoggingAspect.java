package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void anyMethodFromUniLibrary(){
//        System.out.println("anyMethodFromUniLibrary");
//    }
//    @Pointcut("execution(* aop.UniLibrary.addBook())")
//    private void addBookMethodToUniLibrary(){
//        System.out.println("addBookMethodToUniLibrary");
//    }
//
//    @Pointcut("anyMethodFromUniLibrary() && !addBookMethodToUniLibrary()")
//    private void exceptAddBookToUniLibrary(){
//
//    }
//
//    @Before("exceptAddBookToUniLibrary()")
//    public void except(){
//        System.out.println("except -> log 4");
//    }


//    @Before("anyMethodFromUniLibrary()")
//    public void anyMethodFromUni(){
//        System.out.println("anyMethodFromUni -> log1");
//    }
//
//    @Before("addBookMethodToUniLibrary()")
//    public void addMethodFromUni(){
//        System.out.println("addMethodFromUni -> log2");
//    }




//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLinrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsToUniLinrary(){}
//
//    @Pointcut("allGetMethodsFromUniLinrary() || allReturnMethodsToUniLinrary()")
//    private void allGetAndReturnMethodsToUniLinrary(){}
//
//
//
//    @Before("allGetMethodsFromUniLinrary()")
//    public void beforeGetLoggingAdvise(){
//        System.out.println("beforeGetLoggingAdvise -> writing log #1");
//    }
//
//    @Before("allReturnMethodsToUniLinrary()")
//    public void beforeReturnLoggingAdvise(){
//        System.out.println("beforeReturnLoggingAdvise -> writing log #2");
//    }
//
//    @Before("allGetAndReturnMethodsToUniLinrary()")
//    public void beforeGetAndReturn(){
//        System.out.println("beforeGetAndReturn -> writing log #3");
//    }





    @Before("aop.aspects.MyPointCuts.allGetMethods()")
    public void BeforeGetLoggingAdvice(){
        System.out.println("BeforeGetLoggingAdvice " +
                "-> логирование попытки получить книгу или журнал");
    }




//    @Before("execution(public void return*())")
//    public void loggingBeforeReturnAdvice(){
//
//        System.out.println("loggingBeforeReturnAdvice: Попытка вернуть книгу");
//    }
}
