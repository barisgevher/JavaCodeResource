public class OverloadChallenge {
    public static void main(String[] args) {
        // 1 inch = 2.54 cm.
        // 1 foot 12 inches

        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + " cm");
        System.out.println("68in = " + convertToCentimeters(68) + " cm");

    }
     public static double convertToCentimeters(int inches){

        double centimeters = (double)(inches * 2.54d);
        return  centimeters;
     }
    public static double convertToCentimeters(int feet ,int inches){

       feet = 12 * inches;
       inches += feet;
       return convertToCentimeters(inches);


    }

}
