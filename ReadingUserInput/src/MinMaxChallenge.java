import java.util.Scanner;

public class MinMaxChallenge {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double min = 0;
//        double max = 0;
//
//        boolean donence = false;
//
//
//        while(!donence){
//            System.out.println("Enter a number or enter any character to quit");
//            String value = scanner.nextLine();
//            try{
//                double parsedValue = Double.parseDouble(value);
//                if (parsedValue > max){
//                    max = parsedValue;
//                }
//                min = parsedValue;
//
//            }catch (NumberFormatException nfe){
//
//
//               donence = true;
//            }
//
//        }
//
//        System.out.println("Max Value = " + max);
//        System.out.println("Min Value = " + min);
//
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min = 0;
        double max = 0;
        int loopCount = 0;

        while(true){
            System.out.println("Enter a number, or any character to exit: ");
            String nextEntry = scanner.nextLine();
            try{
               double validNumber =  Double.parseDouble(nextEntry);
               if (loopCount == 0 || validNumber < min){
                   min = validNumber;
               }
               if (loopCount == 0 || validNumber > max){
                max = validNumber;
               }
               loopCount++;
            }catch (NumberFormatException nfe){
                break;
            }
        }

        if (loopCount > 0){
            System.out.println("min = " + min + ", max = " + max);
        }else{
            System.out.println("No valid data entered");
        }
    }

}
