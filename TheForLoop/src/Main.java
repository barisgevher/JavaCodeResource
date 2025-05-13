public class Main {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++){
            System.out.println(counter);
        }

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));
        System.out.println("*****************************************");
        for(double rate = 2.0d; rate <= 5.0d; rate++){
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " +  rate + "% interest = " + interestAmount);
        }
        System.out.println("*****************************************");

        for(double rate = 7.5d; rate <= 10.0d; rate += 0.25){
            double interestAmount = calculateInterest(100.0d, rate);
            if (interestAmount > 8.50d){
                break;
            }
            System.out.println("100 at " +  rate + "% interest = " + interestAmount);
        }
    }

    private static double calculateInterest(double amount, double interestRate) {
        return  (amount * (interestRate / 100));
    }
}
