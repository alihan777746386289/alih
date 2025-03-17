// models/Book.java
public class Book {
    // Кітаптың өрістері
    private String title;
    private String author;
    private double price;

    // Конструктор
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Кітаптың атын алу
    public String getTitle() {
        return title;
    }

    // Кітаптың атын орнату
    public void setTitle(String title) {
        this.title = title;
    }

    // Авторын алу
    public String getAuthor() {
        return author;
    }

    // Авторын орнату
    public void setAuthor(String author) {
        this.author = author;
    }

    // Бағасын алу
    public double getPrice() {
        return price;
    }

    // Бағасын орнату
    public void setPrice(double price) {
        this.price = price;
    }

    // Кітап туралы мәлімет шығару
    @Override
    public String toString() {
        return "Кітап атауы: " + title + ", Автор: " + author + ", Бағасы: " + price + "₸";
    }
}
