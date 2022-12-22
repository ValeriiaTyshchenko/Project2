package BookStoreOOP;

public class BooksStoreMain {
    public static void main(String[] args) {
        AudioBook book1 = new AudioBook("Harry Potter", "J.K. Rowling", 1, 10.5, false, "mp3", 128, "Smith");
        book1.printBookDetails();
       EBook book2 = new EBook("Anna Karenina", "L.Tolstoy", 2, 20, true,"www.bookstore.com");
       book2.setUsdPrice(10);
       book2.printBookDetails();
        PrintedBook book3 = new PrintedBook("Kobzar", "T. Shevchenko", 3, 25, true, 528);
        book3.setAvailable(false);
        book3.printBookDetails();

//        book1.setAvailable(true);
//        book2.setUsdPrice(30);
//
//        book1.printBookDetails();
//        book2.printBookDetails();
//    }
    }
}
