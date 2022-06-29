package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//   ("execution(* getStudents())")

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterGetStudentsLoggingAdvice(List<Student> students) {
//
//        Student firstStudent = students.get(0);
//        String nameLastname = firstStudent.getNameLastname();
//        nameLastname = "Mr. " +nameLastname;
//        firstStudent.setNameLastname(nameLastname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade +1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterGetStudentsLoggingAdvice: " +
//                "logging getting list of students after method getStudents");
//        System.out.println("------------------------------------------------");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingError(Throwable exception){
//        System.out.println("Логируем выброс исключения " + exception);
//    }
    @After("execution(* getStudents())")
    public void afterGetStudents(){
        System.out.println("afterGetStudents()");
    }
}
