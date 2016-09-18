package by.bsuir.task15;

import by.bsuir.task12.Book;
import org.junit.Test;

public class AuthorTitlePriceComparatorTest extends ComparatorTest {

    @Test
    public void testSorting() {
        super.testSorting(new AuthorTitlePriceComparator());
    }

    @Override
    protected boolean isSorted(Book[] books) {
        for (int i = 0; i < books.length - 1; i++) {
            if (books[i].getAuthor().compareTo(books[i + 1].getAuthor()) > 0) {
                return false;
            } else if (books[i].getAuthor().compareTo(books[i + 1].getAuthor()) == 0) {
                if (books[i].getTitle().compareTo(books[i + 1].getTitle()) > 0) {
                    return false;
                } else if (books[i].getPrice() > books[i].getPrice()) {
                    return false;
                }
            }
        }
        return true;
    }
}