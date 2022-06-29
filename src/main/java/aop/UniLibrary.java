package aop;

import org.springframework.stereotype.Component;
//
@Component
public class UniLibrary extends AbstractLibrary{

    @Override
    public void getBook(){
        System.out.println("We take book from University library");
        System.out.println("------------------------------------");
    }

    public void getMagazine(){

        System.out.println("We take magazine from University library");
        System.out.println("------------------------------------");
    }

    public String returnBook(){

        int a = 10/0;
        System.out.println("We return book to University library");
        return "Tom Sawyer";

    }
    public void returnMagazine(){

        System.out.println("We return magazine to University library");
        System.out.println("------------------------------------");
    }

    public void addMagazine(){

        System.out.println("We add magazine to University library");
        System.out.println("------------------------------------");
    }
    public void addBook(Book book,String person_name){

        System.out.println("We add book to University library");
        System.out.println("------------------------------------");
    }
}
