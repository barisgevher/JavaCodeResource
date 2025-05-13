public class TernaryOperator {
    public static void main(String[] args) {
       String makeOfCar = "Volkswagen";
       boolean isDomestic = makeOfCar == "Volswagen" ? false : true;

       if (isDomestic){
           System.out.println("This car is domestic to our country");
       }

       String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);


        /*
        * Challenge
        */
        System.out.println("****************************** chalenge ****************************");

        System.out.println(" MY SOLUTİON");
        double var1 = 20.00d;
        double var2 = 80.00d;
        double result = ((var1 + var2) * 100.00d) % 40.00d;

        boolean resultVariable = result == 0.00d ? true : false;
        System.out.println(resultVariable);
        if (!resultVariable){
            System.out.println("got some remainder");

        }else {
            System.out.println("there is none of an remainder");
        }

        System.out.println("Solution from course");

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyvaluesTotal = " + myValuesTotal);
        double theRemainer = myValuesTotal % 40.00d;
        System.out.println("theRemainer = " + theRemainer);
        boolean isNoRemainer = (theRemainer == 0) ? true : false;
        System.out.println("isNoRemaineder = " + isNoRemainer);
        if (!isNoRemainer){
            System.out.println("Got some remainer");
        }


    }
}
