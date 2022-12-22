package bookstore1;

public class Book {
    //describe a book, create all the variables we need
    // name, author, id, price in USD, availability
    // using conversion rate, calculate EUR Price of boo
    // using conversion rate, calculate UAH Price of book
    // print all the book details including prices

    String euro = "EUR";
    String hryvna = "UAH";

    public static void main(String[] args) {


        Book book1 = new Book();
        book1.creteNewBook("Harry Potter", "J.K. Rowling", 1, 10.5, false);
        book1.creteNewBook("Anna Karenina", "L.Tolstoy", 2, 20, true);


    }

    public void creteNewBook(String bookName, String authorName, int id, double priceInUSD, boolean isAvailable){

        double priceInEUR = calculatePrice(priceInUSD, euro);
        double priceInUAH = calculatePrice(priceInUSD, hryvna);



        System.out.println("Book name is: " + bookName);
        System.out.println("Book id is: " + id);
        System.out.println("Book price: " + priceInUSD + " USD, " + priceInEUR + " EUR, " + priceInUAH + " UAH");
        System.out.println("Book is available: " + isAvailable);

    }

    public double calculatePrice(double priceInUsd, String currency){
        double rate = 1;
        if (currency.equals(euro)){
            rate = 1.1;
        }
        else if (currency.equals(hryvna)) {
            rate = 30;

        }
        else {
            System.out.println("Error: unknown currency, USD price will be returned ");
        }
        double priceAfterConversion = priceInUsd * rate;
        return priceAfterConversion;



    }
}
