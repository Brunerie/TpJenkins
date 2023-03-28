import exercice1.Book;

public class testBook {
    public static void main(String[] args) {
        Book book = new Book("Java", "John Doe", "2019");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuteur());
        System.out.println("Date: " + book.getDatePublication());
    }
}
