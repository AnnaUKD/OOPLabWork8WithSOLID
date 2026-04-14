public class VolumeDiscount implements DiscountStrategy {
    private final double threshold;
    private final double percent;

    public VolumeDiscount(double threshold, double percent) {
        this.threshold = threshold;
        this.percent   = percent;
    }

    @Override
    public double apply(double total) {
        if (total > threshold) {
            return total * (1 - percent / 100);
        } else {
            return total;
        }
    }

    @Override
    public String description() {
        return String.format("Знижка на обсяг (якщо > %.0f грн): -%.0f%%", threshold, percent);
    }
}
