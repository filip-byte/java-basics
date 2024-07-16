package books;

public class Book {

    public static void main(String[] args) {
        Book book = new Book("Spider-Man",10);
        System.out.println(book.getTitle());
        System.out.println(book.getCurrentPage());
        book.turnPage(5);
        System.out.println(book.getCurrentPage());
        System.out.println(book.getTitle());
    }

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

    public int getCurrentPage() {
        return currentPage;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int turnPage(int num) {
        return currentPage+= num;
    }
}
