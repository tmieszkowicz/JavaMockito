public class Book {

    private String title;
    private Category category;

    Book(String title) {
        this.title = title;
    }

    Book(String title, Category category) {
        this.title = title;
        this.category = category;
    }

    public Book() {

    }

    Category getCategory() {
        return this.category;
    }

    boolean hasCategory() {
        return this.category != null;
    }

    String getTitle() {
        return this.title;
    }

    protected enum Category {Action, Fiction, Drama, Romance}
}
