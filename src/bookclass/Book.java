package bookclass;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {

        String authorsStr = new String();

        for (Author author : authors){
            authorsStr+= author.toString() + "; ";}

        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + authorsStr +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getAuthorNames(){
        String authorNames = ""; //Чем отличается такая инициализация строки от инициализации в прошлом методе?

        for (Author author : authors){
            authorNames+= author.getName() + "; ";}

        return authorNames;
    }
}
