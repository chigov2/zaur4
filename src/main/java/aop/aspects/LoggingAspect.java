package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
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







    @Before("aop.aspects.MyPointCuts.allAddMethods()")
    public void BeforeAddLoggingAdvice(JoinPoint joinPoint){

       MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//        Signature methodSignature = joinPoint.getSignature();
        System.out.println("methodSignature -> " + methodSignature);
        System.out.println("methodSignature.getMethod() -> " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() -> " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() -> " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments){
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Инфо о книге: " +myBook.getName() + " "
                            + "Автор: " + myBook.getAuthor() + " "
                            + "Год издания: " + myBook.getYearOfPublication());
                }else if (obj instanceof String){
                    System.out.println("Книгу в библиотеку добавил: "+ obj);
                }
            }
        }

        System.out.println("BeforeAddLoggingAdvice " +
                "-> логирование попытки получить книгу или журнал");
        System.out.println("------------------------------------");
    }




//    @Before("execution(public void return*())")
//    public void loggingBeforeReturnAdvice(){
//
//        System.out.println("loggingBeforeReturnAdvice: Попытка вернуть книгу");
//    }
}
