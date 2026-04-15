public class LoyaltyDiscount implements DiscountStrategy {

    public double apply(double total) {
        return total - (total * 12 / 100);
    }

    public String description() {
        return "Знижка постійного клієнта: -12%";
    }
}
