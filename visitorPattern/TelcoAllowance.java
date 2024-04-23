package visitorPattern;



public class TelcoAllowance implements UsagePromo{
    @Override
    public String showAllowance(String telcoName, double money) {
        return telcoName + " offers a data allowance of " + money + " per month.";
    }
}
