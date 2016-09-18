package by.bsuir.task13;

import org.junit.Test;

import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertEquals;

public class ProgrammerBookTest {

    @Test
    public void testSameBooks() {
        ProgrammerBook bookA = new ProgrammerBook("Thinking in Java", "Bruce Eckel", 20, "English", 5);
        ProgrammerBook bookB = new ProgrammerBook("Thinking in Java", "Bruce Eckel", 20, "English", 5);
        assertEquals(bookA, bookB);
    }

    @Test
    public void testNotSameBooks() {
        ProgrammerBook bookA = new ProgrammerBook("Thinking in Java", "Bruce Eckel", 20, "English", 5);
        ProgrammerBook bookB = new ProgrammerBook("Мобильная разработка Delphi", "Всеволод Леонов", 10, "Русский", 2);
        assertNotSame(bookA, bookB);
    }

    @Test
    public void testSimilarBooks() {
        ProgrammerBook bookA = new ProgrammerBook("Thinking in Java", "Bruce Eckel", 20, "English", 5);
        ProgrammerBook bookB = new ProgrammerBook("C# 5.0", "Andrew Troelsen", 20, "English", 5);
        assertNotSame(bookA, bookB);
        bookB.setTitle(bookA.getTitle());
        bookB.setAuthor(bookA.getAuthor());
        assertEquals(bookA, bookB);
    }
}