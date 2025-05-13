public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setDoors(2);
    car.setConvertible(true);
    car.setColor("Black");
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();
    }

}
