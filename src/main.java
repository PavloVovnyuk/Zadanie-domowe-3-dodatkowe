public class main {
    public static void main(String[] args) {

        Category category1 = new Category ("Słodycze", "Coś słodkiego dla każdego");
        Product product1 = new Product ("Batonik", 20, "Mleczny", category1);
        Product product2 = new Product ("Czekolada", 17, "czarna", category1);

        Category category2 = new Category ("Pieczywo", "Dla dzieci");
        Product product3 = new Product ("Pieczywo jasne", 10, "100% naturalne", category2);

        Product product4 = new Product ("Sok", 8, "pomaranczowy");

        SpecialOffer specialOffer = new SpecialOffer ("Zniżka świąteczna", 15, product1.price / 5, product1);


        System.out.println (product1.nameProduct + " " + product1.aboutProduct + " " + product1.price + " " + product1.category.name + " " + product1.category.about);
        System.out.println (product2.nameProduct + " " + product2.aboutProduct + " " + product2.price + " " + product2.category.name + " " + product2.category.about);
        System.out.println (product3.nameProduct + " " + product3.aboutProduct + " " + product3.price + " " + product3.category.name + " " + product3.category.about);
        System.out.println (product4.nameProduct + " " + product4.aboutProduct + " " + product4.price);
        System.out.println (specialOffer.offert + " " + specialOffer.timeOffert + " " + specialOffer.discount + " " + product1.nameProduct);
    }

}
