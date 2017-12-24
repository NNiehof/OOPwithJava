
/**
 *
 * @author NNiehof
 */

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> catalogue;
    
    public Library() {
        this.catalogue = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook) {
        this.catalogue.add(newBook);
    }
    
    public void printBooks() {
        for (Book entry : this.catalogue) {
            System.out.println(entry);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : this.catalogue) {
            if (StringUtils.included(book.title(), title)) {
                found.add(book);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : this.catalogue) {
            if (StringUtils.included(book.publisher(), publisher)) {
                found.add(book);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : this.catalogue) {
            if (book.year() == year) {
                found.add(book);
            }
        }
        return found;
    }
}
