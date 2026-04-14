class HolidayDiscount implements DiscountStrategy {
    private final double percent;

    public HolidayDiscount(double percent) {
        this.percent = percent;
    }

    @Override
    public double apply(double total) {
        return total * (1 - percent / 100);
    }

    @Override
    public String description() {
        return String.format("Святкова знижка: -%.0f%%", percent);
    }
}