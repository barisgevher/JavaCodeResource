public class Burger {
    private String burgerType;
    private double basePrice;
    private String topping1;
    private String topping2;
    private String topping3;
    private double burgerPrice;

    public Burger(String burgerType, double basePrice) {
        this.burgerType = burgerType;
        this.basePrice = basePrice;
        this.burgerPrice = basePrice;
    }

    public Burger(String burgerType, double basePrice, String topping1, String topping2, String topping3) {

        double toppingPrice = 0;
        this.burgerType = burgerType;
        this.basePrice = basePrice;
        this.burgerPrice = this.basePrice;
        if (topping1 != null){
            this.burgerPrice += 1.00d;
        } else if (topping2 != null) {
            this.burgerPrice += 1.00d;
        } else if (topping3 != null) {
            this.burgerPrice += 1.00d;
        } else if (topping1 != null && topping2 != null) {
            this.burgerPrice += 2.00d;
        } else if (topping2 != null && topping3 != null) {
            this.burgerPrice += 2.00d;
        }else if (topping1 != null && topping3 != null) {
            this.burgerPrice += 2.00d;
        }else if (topping1 != null && topping2 != null && topping3 != null) {
            this.burgerPrice += 3.00d;
        }

    }

    public double getBurgerPrice() {
        return burgerPrice;
    }
}
