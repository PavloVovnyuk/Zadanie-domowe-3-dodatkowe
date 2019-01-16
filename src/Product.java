public class Product {


    String nameProduct;
    double price;
    String aboutProduct;
    Category category;

    Product(String name1Product, double price, String aboutProduct, Category category) {
        this.nameProduct = name1Product;
        this.price = price;
        this.aboutProduct = aboutProduct;
        this.category = category;

    }

    Product(String name1Product, double price, String aboutProduct) {
        this.nameProduct = name1Product;
        this.price = price;
        this.aboutProduct = aboutProduct;
    }

}


