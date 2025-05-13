public class WhileChallenge {
    public static void main(String[] args) {

//        int i = 5;
//
//        while(i <= 20){
//            if (isEvenNumber(i)){
//                System.out.println(i);
//            }
//
//            i++;
//       }

//        int number = 4;
//        int finishNumber = 20;
//        int totalNumberOfEvens = 0;
//        int loopNumberCount = 0;
//        while(number <= finishNumber){
//            number ++;
//            if (!isEvenNumber(number)){
//                continue;
//            }
//            totalNumberOfEvens += 1;
//            if (totalNumberOfEvens == 5){
//                System.out.println(number + " counted numbers are found");
//                System.out.println( number - totalNumberOfEvens + " counted numbers are odd");
//                System.out.println(totalNumberOfEvens + " even number has been found");
//                break;
//            }
//            System.out.println(number + " is a even number");
//        }

        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        while( number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                oddCount++;
                continue;
            }
            System.out.println("Even number " + number);
            evenCount++;
            if (evenCount >= 5){
                break;
            }
        }
        System.out.println("Odd numbers count = " + oddCount);
        System.out.println("Even numbers count = " + evenCount);

    }

    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return  true;
        }else{
            return  false;
        }
    }


}
