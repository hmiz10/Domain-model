package be.intecbrussel.lambdatest.model;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.stream.Stream;

public class BookApp {
    public static void main(String[] args) {

     Book[] bookArray = new Book [5];

     bookArray[0] = new Book ("Harry Potter and the Deathly Hallows",
                    new Person ("J.K ","Rowling", LocalDate.of(1965, 7,31)),
                    LocalDate.of(2020,8,8),
                                "fantasy");
     bookArray[1] = new Book ("The help", new Person ("Kathryn","Kathryn stockett",LocalDate.of(1969,1,1)), LocalDate.of(2020,9,1),"science-fiction");
     bookArray[2] = new Book ("Life of Pi", new Person("Yann", "Martel",LocalDate.of(1963,6,25)), LocalDate.of(2020,10,2),"Fantasy");
     bookArray[3] = new Book ("Middlesex", new Person ("Jeffrey","Eugenides",LocalDate.of(1960,3,8)), LocalDate.of(2020,9,15),"Opvoeding");
     bookArray[4] = new Book ("Twilight", new Person ("Stephenie","Meyer",LocalDate.of(1973,12,3)), LocalDate.of(2020,12,5),"Vampire");

    }

    public static Book getNewestBook(Book[] books){
        return Stream.of(books)
                .sorted(Comparator.comparing(e -> ((Book)e).getReleaseDate()))
                .findFirst()
                .get();
    }

    public static void  printYoungestWriter(Book[] books ){

        Person author = Stream.of(books).sorted(Comparator.comparing(e -> ((Book)e).getAuthor().getDateOfBirth()).reversed())
                                        .findFirst()
                                        .get()
                                        .getAuthor();

        System.out.println ("the youngest writer is : " + author.getFirstName() + " "+ author.getLastName());

        }

        public static void printSortedByTitle (Book[] books) {
           Stream.of(books).sorted(Comparator.comparing(e -> ((Book)e).getTitle()))
                           .forEach(e -> System.out.println(e));
        }
}
