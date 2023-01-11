public class Book extends ReadingItem{
    private String isbn;
    private String edition;
    private String title;
    public Book(String name_, String location_, int price_, String description_, int wordCount_, String datePublished_, String author_, String isbn_, String edition_, String title_) {
        super(name_, location_, price_, description_, wordCount_, datePublished_, author_);
        isbn = isbn_;
        edition = edition_;
        title = title_;
    }

    public String toString() {
        return "Book --> " + super.toString() + "\nisbn: " + getIsbn() + ", edition: " + getEdition() + ", title: " + getTitle();
    }
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
