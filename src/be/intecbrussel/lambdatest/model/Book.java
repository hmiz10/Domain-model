package be.intecbrussel.lambdatest.model;

import java.time.LocalDate;

public class Book {

    public String title;
    public Person author;
    public LocalDate releaseDate;
    public String genre;


    Book(String title, Person author, LocalDate date, String genre){
        this.title = title;
        this.author = author;
        this.releaseDate = date;
        this.genre = genre;
    }



    public String getTitle() {
        return title;
    }

    public Person getAuthor() {
        return author;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getGenre() {
        return genre;
    }


}
