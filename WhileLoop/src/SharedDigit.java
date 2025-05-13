    public class SharedDigit {

        public static boolean hasSharedDigit(int first, int second) {

            boolean firstValid = first > 9 && first < 100;
            boolean secondValid = second > 9 && second < 100;

            if (!firstValid || !secondValid) {
                return false;
            }

            int firstLeftDigit = first / 10;
            int firstRightDigit = first % 10;
            int secondLeftDigit = second / 10;
            int secondRightDigit = second % 10;

            boolean firstShared = firstLeftDigit == secondLeftDigit || firstLeftDigit == secondRightDigit;
            boolean secondShared = firstRightDigit == secondLeftDigit || firstRightDigit == secondRightDigit;

            return firstShared || secondShared;
        }

        //    public static void main(String[] args) {
//        System.out.println(hasSharedDigit(124, 231));
//    }
//    public static boolean hasSharedDigit(int num1, int num2){
//        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
//            return false;
//
//        }
//        for(int i = num1; i > 0; i/= 10){
//            int digitNum1 = i % 10;
//            for( int j = num2; i > 0; j/=10){
//                int digitNum2 = j % 10;
//                if (digitNum1 == digitNum2){
//                    return true;
//                }
//            }
//        }
//        return false;
//
//
//    }

    }
