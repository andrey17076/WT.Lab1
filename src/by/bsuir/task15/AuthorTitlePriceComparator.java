package by.bsuir.task15;

import by.bsuir.task12.Book;

import java.util.Comparator;

public class AuthorTitlePriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        int authorTitleCompareResult = new AuthorTitleComparator().compare(book1, book2);
        if (authorTitleCompareResult == 0) {
            return book1.getPrice() - book2.getPrice();
        }
        return authorTitleCompareResult;
    }
}
