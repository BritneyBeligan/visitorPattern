package visitorPattern;

public class Telco implements TelcoSubscription {
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(String telcoName, int dataAllowance, double promoPrice, boolean unliCallText) {
        this.telcoName = telcoName;
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price) {
        return promo.showAllowance(telcoName, price);
    }

    @Override
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText) {
        return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    public int getDataAllowance() {
        return dataAllowance;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public String getTelcoName() {
        return telcoName;
    }

    public boolean UnliCallText() {
        return unliCallText;
    }
}
