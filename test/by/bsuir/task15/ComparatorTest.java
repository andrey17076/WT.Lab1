package by.bsuir.task15;

import by.bsuir.task12.Book;
import org.junit.Before;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import static org.junit.Assert.assertTrue;

abstract class ComparatorTest {

    private static final Random RANDOM = new Random();
    private Book[] books;

    @Before
    public void prepareData() {
        books = new Book[RANDOM.nextInt(1000)];
        for (int i = 0; i < books.length; i++) {
            books[i] = createBook();
        }
    }

    protected abstract boolean isSorted(Book[] books);

    void testSorting(Comparator<Book> comparator) {
        Arrays.sort(books, comparator);
        assertTrue(isSorted(books));
    }

    private Book createBook() {
        return new Book(
                String.valueOf(RANDOM.nextInt(1000)),
                String.valueOf(RANDOM.nextInt(1000)),
                RANDOM.nextInt(1000),
                RANDOM.nextInt(1000)
        );
    }
}
