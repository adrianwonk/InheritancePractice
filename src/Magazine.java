public class Magazine extends ReadingItem{
    private String coverStoryTitle;
    private String printDate;

    public Magazine(String name_, String location_, int price_, String description_, int wordCount_, String datePublished_, String author_, String coverStoryTitle, String printDate) {
        super(name_, location_, price_, description_, wordCount_, datePublished_, author_);
        this.coverStoryTitle = coverStoryTitle;
        this.printDate = printDate;
    }

    @Override
    public String toString() {
        return "Magazine --> " + super.toString() + "\ncoverStoryTitle: " + getCoverStoryTitle() + ", printDate: " + getPrintDate();
    }

    public String getCoverStoryTitle() {
        return coverStoryTitle;
    }

    public void setCoverStoryTitle(String coverStoryTitle) {
        this.coverStoryTitle = coverStoryTitle;
    }

    public String getPrintDate() {
        return printDate;
    }

    public void setPrintDate(String printDate) {
        this.printDate = printDate;
    }
}
