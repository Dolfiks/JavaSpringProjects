package aoptest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mybook")
public class Book {
    @Value("Lavkraft")
    private String author;
    @Value("Zov Ktulhu")
    private String nameBook;

    public String getAuthor() {
        return author;
    }

    public String getNameBook() {
        return nameBook;
    }


    public void getBook() {
        System.out.println("You are get book " + getAuthor() + " " + getNameBook());
    }

    public void nameBook() {
        System.out.println("Name book: " + getNameBook());
    }

    public void authorBook() {
        System.out.println("Author book: " + getAuthor());
    }
}
