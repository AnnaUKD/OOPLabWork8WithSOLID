public interface DiscountStrategy {
    double apply(double total);
    String description();
}
