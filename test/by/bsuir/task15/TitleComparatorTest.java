package by.bsuir.task15;

import by.bsuir.task12.Book;
import org.junit.Test;

public class TitleComparatorTest extends ComparatorTest {

    @Test
    public void testSorting() {
        super.testSorting(new TitleAuthorComparator());
    }

    protected boolean isSorted(Book[] books) {
        for (int i = 0; i < books.length - 1; i++) {
            if (books[i].getTitle().compareTo(books[i + 1].getTitle()) > 0) {
                return false;
            }
        }
        return true;
    }
}