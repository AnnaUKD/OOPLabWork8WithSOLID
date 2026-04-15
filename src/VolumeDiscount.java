public class VolumeDiscount implements DiscountStrategy {
    double threshold;
    double percent;

    public VolumeDiscount(double threshold, double percent) {
        this.threshold = threshold;
        this.percent   = percent;
    }

    public double apply(double total) {
        if (total > threshold) {
            return total - (total * percent / 100);
        }
        return total;
    }

    public String description() {
        return "Знижка на обсяг (якщо > " + threshold + " грн): -" + percent + "%";
    }
}
