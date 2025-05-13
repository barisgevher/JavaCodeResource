public class DigitSumChallenge {
    public static void main(String[] args) {

     //  int number = 64446646;
//        int n1 = number % 1000000;
//        n1 = n1 / 100000;
//        System.out.println(n1);
//


//        for (int i = 10; i < number; i *= 10){
//            System.out.println(i);
//        }
//        System.out.println(sumDigits(number));

        System.out.println("The sum of the digits in number 1234 is " + sumDigits(1234));
        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));
    }

    public  static int sumDigits(int number) {
        if (number < 0){
            return -1;
        }
        int sum = 0;

        while(number > 9){
            sum += (number % 10);
            number = number / 10;

        }
        sum += number;

        return  sum;
    }

//    public static int sumDigits(int number){
//        if (number < 0){
//            return  -1;
//        }
//            int sum = 0;
//            int digit;
//            for (int i = 10; i <= number * 10; i *= 10){
//                 digit = number % i;
//                 digit = digit / (i/10);
//                 sum += digit;
//            }
//            return  sum;
//    }




}
