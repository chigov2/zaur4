package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Tom Sawyer2")
    private String name;
    @Value("Mark Twain")
    private String author;
    @Value("1884")
    private int yearOfPublication;

    public String getAuthor() {
        return author;
    }

    public Book() {
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }


    public String getName() {
        return name;
    }

    public Book(String name, String author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }
}
