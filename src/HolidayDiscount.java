public class HolidayDiscount implements DiscountStrategy {

    double percent;

    public HolidayDiscount(double percent) {
        this.percent = percent;
    }

    public double apply(double total) {
        return total - (total * percent / 100);
    }

    public String description() {
        return "Святкова знижка: -" + percent + "%";
    }
}
