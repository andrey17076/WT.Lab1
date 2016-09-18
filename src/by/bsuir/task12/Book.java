package by.bsuir.task12;

class Book {

    private String title;
    private String author;
    private int price;
    private static int edition;

    Book(String title, String author, int price) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    static int getEdition() {
        return edition;
    }

    static void setEdition(int edition) {
        Book.edition = edition;
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getAuthor() {
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        this.price = price;
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
        return "Book{title='" + title + "'" + ", author='" + author + "'" + ", price=" + price + '}';
    }
}
