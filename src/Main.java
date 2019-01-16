public class Main {
    public static void main(String[] args) {

        Category category1 = new Category ("Słodycze","Coś słodkiego dla każdego");
        Product product1 = new Product ("Batonik", 20, "Mleczny", category1);
        Product product2 = new Product ("Czekolada", 17, "Czarna", category1);

        Category category2 = new Category ("Pieczywo", "Dla dzieci");
        Product product3 = new Product ("Pieczywo jasne", 10, "100% naturalne", category2);

        Product product4 = new Product ("Sok", 8, "Pomaranczowy");

        SpecialOffer specialOffer = new SpecialOffer ("Zniżka świąteczna", 15, "1", "15",0.2, product1);


        System.out.println (product1.name + " " + product1.description + " " + product1.price + " " + product1.category.name + " " + product1.category.description);
        System.out.println (product2.name + " " + product2.description + " " + product2.price + " " + product2.category.name + " " + product2.category.description);
        System.out.println (product3.name + " " + product3.description + " " + product3.price + " " + product3.category.name + " " + product3.category.description);
        System.out.println (product4.name + " " + product4.description + " " + product4.price);
        System.out.println (specialOffer.offer + " " + specialOffer.timeOffer + " " + specialOffer.discount + " " + product1.name);
    }

}
