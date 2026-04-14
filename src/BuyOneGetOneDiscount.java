class BuyOneGetOneDiscount implements DiscountStrategy {
    @Override
    public double apply(double total) {
        return total * 0.75;
    }

    @Override
    public String description() {
        return "Акція «1+1»: -25%";
    }
}