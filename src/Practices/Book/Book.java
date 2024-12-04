package Practices.Book;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Book {
    public String title;
    public String author;
    public int ISBN;
    List<Book>books;

    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.books=new ArrayList<>();

    }

    public void addBook(Book book)
    {
        books.add(book);
    }

//    List<Book> getBooks()
//    {
//
//    }


    public static void main(String[] args) {
        Book book1=new Book("Head First Java","Kathy Sierra",6785428);
        Book book2=new Book("Thinking In Java","Bruce Eckel",2456312);
        Book book3=new Book("Clean Code","Robert Martin",8623578);
        Book book4=new Book("Effective Java","Joshua Bloch",4364236);
    }




}
