package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private double price;
    private int count;
    private String genre;
    private String title;
    private Author authorName;
    private User registeredUser;


    public Book(String title, Author author, double price, int count, String genre, User currentUser) {
    }
}
