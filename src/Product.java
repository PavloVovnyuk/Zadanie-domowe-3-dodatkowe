public class Product {

    String name;
    double price;
    String description;
    Category category;

    Product(String name, double price, String description, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;

    }

    Product(String name1Product, double price, String description) {
        this.name = name1Product;
        this.price = price;
        this.description = description;
    }

}


