package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: " +
                "logging getting list of students before method getStudents");
        System.out.println("------------------------------------------------");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterGetStudentsLoggingAdvice(List<Student> students) {
        Student firstStudent = students.get(0);
        String nameLastname = firstStudent.getNameLastname();
        nameLastname = "Mr. " +nameLastname;
        firstStudent.setNameLastname(nameLastname);




        System.out.println("afterGetStudentsLoggingAdvice: " +
                "logging getting list of students after method getStudents");
        System.out.println("------------------------------------------------");
    }
}
