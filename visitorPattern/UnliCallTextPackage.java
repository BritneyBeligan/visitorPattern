package visitorPattern;


public class UnliCallTextPackage implements UnliCallsTextOffer{

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (unliCallText)
            return telcoName + " offers unlimited calls and texts to all networks within the country.";
        else
            return telcoName + " does not offer unlimited calls and texts.";
    }

}
