package by.bsuir.task12;

public class Book implements Comparable<Book> {

    private static int edition;
    private String title;
    private String author;
    private int price;
    private int isbn;

    public Book(String title, String author, int price, int isbn) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
        setIsbn(isbn);
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || this.getClass() != object.getClass())
            return false;
        Book book = (Book) object;
        return (title.equals(book.getTitle())) && (author.equals(book.getAuthor())) && (price == book.getPrice());
    }

    @Override
    public int hashCode() {
        return title.hashCode() * 31 + author.hashCode() * 17 + price * 13;
    }

    @Override
    public String toString() {
        return "Book{" + getFieldsInfo() + '}';
    }

    @Override
    public Book clone() {
        return new Book(title, author, price, isbn);
    }

    @Override
    public int compareTo(Book book) {
        return isbn - book.getIsbn();
    }

    protected String getFieldsInfo() {
        return "title='" + title + "'" + ", author='" + author + "'" + ", price=" + price + ", isbn=" + isbn;
    }
}
