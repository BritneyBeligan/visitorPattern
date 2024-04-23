package visitorPattern;
//okay na
public interface TelcoSubscription {
    String accept(UsagePromo promo, double price);
    String accept(UnliCallsTextOffer unliPackage, boolean unliCallText);

    double getPromoPrice();

    boolean UnliCallText();
}
