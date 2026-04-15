public class BuyOneGetOneDiscount implements DiscountStrategy {

    public double apply(double total) {
        return total - (total * 25 / 100);
    }

    public String description() {
        return "Акція «1+1»: -25%";
    }
}
