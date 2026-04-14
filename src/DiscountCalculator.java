public class DiscountCalculator {
    private final DiscountStrategy strategy;

    public DiscountCalculator(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double subtotal) {
        return strategy.apply(subtotal);
    }

    public String getDiscountInfo() {
        return strategy.description();
    }
}
