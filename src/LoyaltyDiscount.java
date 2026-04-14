class LoyaltyDiscount implements DiscountStrategy {
    @Override
    public double apply(double total) {
        return total * 0.88;
    }

    @Override
    public String description() {
        return "Знижка постійного клієнта: -12%";
    }
}
