//Number To Words
//Write a method called numberToWords with one int parameter named number.
//
//The method should print out the passed number using words for the digits.
//
//If the number is negative, print "Invalid Value".
//
//To print the number as words, follow these steps:
//
//Extract the last digit of the given number using the remainder operator.
//
//Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
//
//Remove the last digit from the number.
//
//Repeat Steps 2 through 4 until the number is 0.
//
//The logic above is correct, but in its current state, the words will be printed in reverse order. For example, if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four". To overcome this problem, write a second method called reverse.
//
//The method reverse should have one int parameter and return the reversed number (int). For example, if the number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.
//
//Use the method reverse within the method numberToWords in order to print the words in the correct order.
//
//Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001). The logic above for the method numberToWords will print "One", but that is incorrect. It should print "One Zero Zero". To solve this problem, write a third method called getDigitCount.
//
//The method getDigitCount should have one int parameter called number and return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value.
//For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).
//
//Example Input/Output - getDigitCount method
//
//getDigitCount(0); should return 1 since there is only 1 digit
//
//getDigitCount(123); should return 3
//
//getDigitCount(-12); should return -1 since the parameter is negative
//
//getDigitCount(5200); should return 4 since there are 4 digits in the number
//
//Example Input/Output - reverse method
//
//reverse(-121); should  return -121
//
//reverse(1212); should return  2121
//
//reverse(1234); should return 4321
//
//reverse(100); should return 1
//
//Example Input/Output - numberToWords method
//
//numberToWords(123); should print "One Two Three".
//
//numberToWords(1010); should print "One Zero One Zero".
//
//numberToWords(1000); should print "One Zero Zero Zero".
//
//numberToWords(-12); should print "Invalid Value" since the parameter is negative.
//
//
//
//        HINT: Use a for loop to print zeroes after reversing the number. As seen in a previous example, 100 reversed becomes 1, but the method numberToWords should print "One Zero Zero". To get the number of zeroes, check the difference between the digit count from the original number and the reversed number.
//
//NOTE: When printing words, each word can be in its own line. For example, numberToWords(123); can be:
//
//One
//        Two
//Three
//They don't have to be separated by a space.
//
//NOTE: The methods numberToWords, getDigitCount, reverse should be defined as public static like we have been doing so far in the course.
//NOTE: In total, you have to write 3 methods.
//
//        NOTE: Do not add a main method to the solution code.

/*
There are several ways you can implement these methods.  This is one way to do it.



reverse(int number):

Initialize a variable reverse to store the reversed number.

Use a while loop to reverse the digits of the number.

Inside the loop, update reverse by multiplying it by 10 and adding the last digit of the number.

Update number by dividing it by 10.

Return the reverse value.

2. getDigitCount(int number):

Handle the special case of a negative number by returning -1.

Handle the special case of number being 0 by returning 1.

Initialize a count variable to store the number of digits.

Use a loop where the counter variable starts from 1 and is multiplied by 10 in each iteration.

Increment the count variable in each iteration.

Return the count value.

3. numberToWords(int number):

Handle the special case of a negative number by printing "Invalid Value" and returning.

Reverse the number using the reverse(int number) method.

Calculate the number of leading zeroes using the difference in digit counts between number and its reverse.

Handle the special case of number being 0 by printing "Zero" and returning.

Use a while loop to extract and print the words for each digit in the reversed number:

Use switch statement to print the word corresponding to the last digit.

Update the reverse value by dividing it by 10.

Use a loop to print the leading zeroes as "Zero" in a loop.

Here's a code skeleton based on the hints:

public class NumberToWords {

    // ... Other methods ...

    public static void numberToWords(int number) {
        // Handle special cases and calculate leading zeroes

        while (reverse != 0) {
            int lastDigit = reverse % 10;
            // Use switch statement to print words for lastDigit
            reverse /= 10;
        }

        // Print leading zeroes using a loop
    }
}
Make sure to replace the comments with the actual code and complete the method implementations accordingly.
*/

public class NumberToWordsChallenge{

    public static void main(String[] args) {

    }

    public static int reverse(int number) {

        int reverse = 0;
        while (number != 0) {
            // multiply by 10 then and add last digit (number % 10)
            reverse = reverse * 10 + number % 10;
            number /= 10; // discard last digit
        }
        return reverse;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;
        // start from 1 and multiply by 10 each step so i goes 1, 10, 100, 1000
        // count how many times it was multiplied, and that's the digit count
        for (int i = 1; i <= number; i *= 10) {
            count++;
        }
        return count;
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        // get reversed number
        int reverse = reverse(number);

        // subtract numberDigits and reverseDigits to get leading zeroes
        int leadingZeroes = getDigitCount(number) - getDigitCount(reverse);

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        // use loop to print words
        while (reverse != 0) {
            int lastDigit = reverse % 10;
            switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            reverse /= 10;
        }

        // print zeroes if there are any leading zeroes in reversed number
        for (int i = 0; i < leadingZeroes; i++) {
            System.out.println("Zero");
        }
    }
}


/*
public class NumberToWords {
       public static void numberToWords(int number){
                if (number < 0){
                    System.out.println("Invalid Value");
                }
                number = reverse(number);

                for (int i = number; i > 9 ; i/=10 ){
                    int digit = i % 10;
                    switch(digit){
                        case 0 -> System.out.println("Zero");
                        case 1 -> System.out.println("One");
                        case 2 -> System.out.println("Two");
                        case 3 -> System.out.println("Three");
                        case 4 -> System.out.println("Four");
                        case 5 -> System.out.println("Five");
                        case 6 -> System.out.println("Six");
                        case 7 -> System.out.println("Seven");
                        case 8 -> System.out.println("Eight");
                        case 9 -> System.out.println("Nine");

                    }
                }
            }

            public static int reverse(int number){
              int reverse = 0;
              int original = number;
              while(original != 0){
                  reverse = reverse * 10 + original % 10;
                  original /= 10;
              }

              return reverse;
            }

            public static int getDigitCount(int number){
                if (number < 0){
                    return -1;
                }
                int digitCount = 0;
                for (int i = number; i > 0 ; i /= 10 ) {
                    digitCount += 1;
                }

                return digitCount;
            }
}
*/

