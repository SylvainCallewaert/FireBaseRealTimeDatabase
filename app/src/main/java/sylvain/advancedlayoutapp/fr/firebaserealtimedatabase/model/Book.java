package sylvain.advancedlayoutapp.fr.firebaserealtimedatabase.model;


public class Book {
    private String title;
    private Double price;
    private Author author;

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Book setPrice(Double price) {
        this.price = price;
        return this;
    }

    public Author getAuteur() {
        return author;
    }

    public Book setAuteur(Author auteur) {
        this.author = auteur;
        return this;
    }

    public Book(String title, Double price, Author auteur) {

        this.title = title;
        this.price = price;
        this.author = auteur;
    }

    public Book() {

    }
}
