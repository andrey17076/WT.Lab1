package by.bsuir.task12;

import org.junit.Test;

import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void testSameBooks() {
        Book bookA = new Book("Fight Club", "Chuck Palahniuk", 15);
        Book bookB = new Book("Fight Club", "Chuck Palahniuk", 15);
        assertEquals(bookA, bookB);
    }

    @Test
    public void testNotSameBooks() {
        Book bookA = new Book("Fight Club", "Chuck Palahniuk", 15);
        Book bookB = new Book("Peter the Great", "Aleksey Tolstoy", 20);
        assertNotSame(bookA, bookB);
    }

    @Test
    public void testSimilarBooks() {
        Book bookA = new Book("Fight Club", "Chuck Palahniuk", 15);
        Book bookB = new Book("Fight Club", "Chuck Palahniuk", 20);
        assertNotSame(bookA, bookB);
        bookB.setPrice(15);
        assertEquals(bookA, bookB);
    }

    @Test
    public void testClone() {
        Book bookA = new Book("Fight Club", "Chuck Palahniuk", 15);
        Object bookB = bookA.clone();
        assertEquals(bookA, bookB);
    }
}