public class ReadingItem extends CISItem {
    int wordCount;
    String datePublished;
    String author;
    public ReadingItem(String name_, String location_, int price_, String description_, int wordCount_, String datePublished_, String author_) {
        super(name_, location_, price_, description_);
        wordCount = wordCount_;
        datePublished = datePublished_;
        author = author_;
    }


    @Override
    public String toString() {
        return "ReadingItem --> "+super.toString() + "\nWordCount: " + getWordCount() + ", datePublished: " + getDatePublished() + ", author: " + getAuthor();
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
