package by.bsuir.task13;

import by.bsuir.task12.Book;

class ProgrammerBook extends Book {

    private String language;
    private int level;

    ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
        super(title, author, price, isbn);
        setLanguage(language);
        setLevel(level);
    }

    String getLanguage() {
        return language;
    }

    void setLanguage(String language) {
        this.language = language;
    }

    int getLevel() {
        return level;
    }

    void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + language.hashCode() * 47 + level * 11;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        if (!super.equals(object))
            return false;
        ProgrammerBook book = (ProgrammerBook) object;
        return (language.equals(book.getLanguage())) && (level == book.level);
    }

    @Override
    public String toString() {
        return "ProgrammerBook{" + super.getFieldsInfo() + "language='" + language + "'" + "level=" + level + "}";
    }
}
