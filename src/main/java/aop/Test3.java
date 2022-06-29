package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("test3 starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary",UniLibrary.class);

        String bookName = uniLibrary.returnBook();
        System.out.println("Book returned to University library: " + bookName);

        context.close();
        System.out.println("test3 stops");
    }
}
