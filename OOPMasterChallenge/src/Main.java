public class Main {
    public static void main(String[] args) {
    Burger burger = new Burger("Whopper", 3.0d);
    Drink drink = new Drink("Coke", 2);
    SideItem sideItem = new SideItem("Fries", 2);

    MealOrder mealOrder = new MealOrder(burger, drink, sideItem);
        System.out.println(mealOrder.getTotalPrice());

    }
}
