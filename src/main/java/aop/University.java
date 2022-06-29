package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student student1 = new Student("Mike Stoba",4,7.5);
        Student student2 = new Student("Olena Gerasymliuk",5,8);
        Student student3 = new Student("Alex Caseres",3,9);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents(){
        System.out.println("Начало работы метода getStudents");
        System.out.println(students.get(4));
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        System.out.println("------------------------------------------------");
        return students;
    }
}
