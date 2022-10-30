package by.bsuir.wt.lab1.book;
import java.util.Comparator;
public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public Book(){}
    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Book) {
            return title == ((Book) object).title
                    && author == ((Book) object).author
                    && price == ((Book) object).price;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return author.hashCode() + title.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Title - %s; Author - %s; Price - %d; Edition - %d;",
                title, author, price, edition);
    }

    @Override
    public Book clone() {
        Book newBook = new Book();
        newBook.title = title;
        newBook.author = author;
        newBook.price = price;

        return newBook;
    }

    @Override
    public int compareTo(Book book) {
        if (this.isbn < book.isbn) {
            return -1;
        } else if (this.isbn > book.isbn) {
            return 1;
        } else {
            return 0;
        }
    }

    public static Comparator<Book> compareByAuthor = (book_1, book_2)
            -> book_1.author.compareToIgnoreCase(book_2.author);
    public static Comparator<Book> compareByTitle = (book_1, book_2)
            -> book_1.title.compareToIgnoreCase(book_2.title);
    public static Comparator<Book> compareByPrice = Comparator.comparingInt(book -> book.price);
    public static Comparator<Book> byTitleThenAuthor = compareByTitle.thenComparing(compareByAuthor);
    public static Comparator<Book> byAuthorThenTitle = compareByAuthor.thenComparing(compareByTitle);
    public static Comparator<Book> byAuthorThenTitleThenPrice = compareByAuthor.thenComparing(compareByTitle).thenComparing(compareByPrice);
}


