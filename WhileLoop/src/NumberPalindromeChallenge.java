public class NumberPalindromeChallenge {
    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int original = number;
        while (original != 0) {
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }
        return reverse == number;
    }
//    public static boolean isPalindrome(int number){
//        int reverse = 0;
//        int digit = 0;
//        while(number != 0){
//            digit += (number % 10);
//
//            reverse *= 10;
//            reverse = digit;
//            number = number / 10;
//
//        }
//
//        if (number == reverse){
//            return true;
//        } else{
//            return false;
//        }
//    }
}
