public abstract class Order {
    abstract double getAmount();
    abstract long getId();

    abstract boolean isInternational();

    abstract double getDiscount();
    abstract double getTotal();
    abstract double getTotalDiscount();
    abstract double getWeight();
    abstract double getTotalWeight();

    public abstract boolean isVIP();
}
