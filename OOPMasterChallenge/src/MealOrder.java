public class MealOrder {
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;
    private double totalPrice;
    public MealOrder() {
    }

    public MealOrder(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
        this.totalPrice = burger.getBurgerPrice() + drink.getPrice() + sideItem.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
