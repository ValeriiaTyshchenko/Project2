package BookStoreOOP;

public class PrintedBook extends Book {


    int amountOfPage;

    public PrintedBook(String name, String authorName, int id, double price, boolean isAvailable, int page) {
        super(name, authorName, id, price, isAvailable);
        this.amountOfPage = page;


    }
    public int getAmountOfPage() {
        return amountOfPage;
    }

    public void setAmountOfPage(int amountOfPage) {
        this.amountOfPage = amountOfPage;
    }

    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("Page numbers:" + amountOfPage);

    }
}
