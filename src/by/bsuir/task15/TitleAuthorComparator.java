package by.bsuir.task15;

import by.bsuir.task12.Book;

import java.util.Comparator;

public class TitleAuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        int titleCompareResult = new TitleComparator().compare(book1, book2);
        if (titleCompareResult == 0) {
            return new AuthorComparator().compare(book1, book2);
        }
        return titleCompareResult;
    }
}
