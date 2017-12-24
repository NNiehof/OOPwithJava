
/**
 *
 * @author NNiehof
 */

public class Book {
    private final String title;
    private final String publisher;
    private final int year;
    
    public Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }
    
    public String title() {
        return this.title;
    }
    
    public String publisher() {
        return this.publisher;
    }
    
    public int year() {
        return this.year;
    }
    
    @Override
    public String toString() {
        return this.title + ", " + this.publisher + ", " + this.year;
    }
}
