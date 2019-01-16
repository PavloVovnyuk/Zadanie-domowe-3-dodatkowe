import java.util.Date;

public class SpecialOffer {
    String offer;//
    double timeOffer;//
    String dataFrom;
    String dataTo;
    double discount;
    Product product;

    SpecialOffer(String offer, double timeOffer, String dataFrom, String dataTo, double discount, Product product) {
        this.offer = offer;
        this.timeOffer = timeOffer;
        this.discount = discount;
        this.product = product;
        this.dataFrom = dataFrom;
        this.dataTo = dataTo;
    }

}
