package aop;

import org.springframework.stereotype.Component;
//
@Component
public class UniLibrary extends AbstractLibrary{

    @Override
    public void getBook(){
        System.out.println("We take book from University library");
    }

    public void getMagazine(){

        System.out.println("We take magazine from University library");
    }

    public void returnBook(){

        System.out.println("We return book to University library");
    }
}
