package iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appenBook(new Book("Around the World in 80 Days"));
        bookShelf.appenBook(new Book("Bible"));
        bookShelf.appenBook(new Book("Cinderella"));
        bookShelf.appenBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
