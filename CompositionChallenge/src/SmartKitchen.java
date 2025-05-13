//public class SmartKitchen {
//    private CoffeeMaker brewMaster;
//    private DishWasher dishWasher;
//    private Refrigerator iceBox;
//
//    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
//        this.brewMaster = brewMaster;
//        this.dishWasher = dishWasher;
//        this.iceBox = iceBox;
//    }
//
//
//    void addWater(){
//
//        brewMaster.addWater();
//        System.out.println("water added to coffee maker");
//    }
//
//    void pourMilk(){
//        brewMaster.pourMilk();
//        System.out.println("Milk poured to coffee");
//    }
//
//    void loadDishWasher(){
//
//    }
//
//    void setKitchenState(boolean isCoffeeMakerHasWorkToDo, boolean isRefrigeratorHasWorkToDo, boolean isDishWasherHasWorkToDo){
//       if (isCoffeeMakerHasWorkToDo){
//           addWater();
//           pourMilk();
//       }
//    }
//
//   void doKitchenWork(){
//
//    }
//}
public class SmartKitchen{
    private  Refrigerator iceBox;
    private DishWasher dishWasher;
    private CoffeeMaker brewMaster;


    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag){
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}

class CoffeeMaker{
    private  boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if (hasWorkToDo){
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }
}

class Refrigerator{
    private  boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if (hasWorkToDo){
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}

class DishWasher{
    private  boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if (hasWorkToDo){
            System.out.println("Washing Dishes");
            hasWorkToDo = false;
        }
    }
}