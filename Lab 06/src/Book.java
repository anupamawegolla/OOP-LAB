public class Book {

    private String title;
    private String author;
    private int pages;

    // Constructor
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    // Method to identify book type
    public String getBookType() {
        if (pages < 100) {
            return "Short Book";
        } else {
            return "Regular Book";
        }
    }
}