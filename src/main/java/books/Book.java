package books;

public class Book {
    private String title;
    private int pages;
    private int currentPage;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
        currentPage = 1;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPage() {
        return this.pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
