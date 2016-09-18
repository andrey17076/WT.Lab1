package by.bsuir.task12;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BookTest {

    @Test
    public void testSameBooks() {
        Book bookA = new Book("Fight Club", "Chuck Palahniuk", 15, 123);
        Book bookB = new Book("Fight Club", "Chuck Palahniuk", 15, 123);
        assertEquals(bookA, bookB);
    }

    @Test
    public void testNotSameBooks() {
        Book bookA = new Book("Fight Club", "Chuck Palahniuk", 15, 123);
        Book bookB = new Book("Peter the Great", "Aleksey Tolstoy", 20, 321);
        assertNotSame(bookA, bookB);
    }

    @Test
    public void testSimilarBooks() {
        Book bookA = new Book("Fight Club", "Chuck Palahniuk", 15, 123);
        Book bookB = new Book("Fight Club", "Chuck Palahniuk", 20, 123);
        assertNotSame(bookA, bookB);
        bookB.setPrice(15);
        assertEquals(bookA, bookB);
    }

    @Test
    public void testClone() {
        Book bookA = new Book("Fight Club", "Chuck Palahniuk", 15, 123);
        Object bookB = bookA.clone();
        assertEquals(bookA, bookB);
    }

    @Test
    public void testSorting() {
        Random random = new Random();
        Book[] books = new Book[random.nextInt(1000)];
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book("Fight Club", "Chuck Palahniuk", 15, random.nextInt(100000));
        }
        Arrays.sort(books);
        assertTrue(isSorted(books));
    }

    private boolean isSorted(Book[] books) {
        for (int i = 0; i < books.length - 1; i++) {
            if (books[i].getIsbn() > books[i + 1].getIsbn()) {
                return false;
            }
        }
        return true;
    }
}