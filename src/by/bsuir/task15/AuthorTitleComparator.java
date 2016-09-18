package by.bsuir.task15;

import by.bsuir.task12.Book;

import java.util.Comparator;

public class AuthorTitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        int authorCompareResult = new AuthorComparator().compare(book1, book2);
        if (authorCompareResult == 0) {
            return new TitleComparator().compare(book1, book2);
        }
        return authorCompareResult;
    }
}
