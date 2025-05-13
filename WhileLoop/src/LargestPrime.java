/*There are several ways you can implement this method.  This is one way to do it.



Check for Validity: The first step is to check if the input number is valid. If the number is less than 1, return -1 as the result is not defined for such inputs.

Iterate Through Factors: Start a loop that iterates from 2 up to the square root of the input number. This is because the largest prime factor of a number cannot exceed its square root.

Check for Factors: Inside the loop, check if the current value of i is a factor of the input number. You can do this by checking if the remainder of number % i is zero. If it's not, move to the next iteration using continue.

Factorization: If i is a factor of the number, store its value in the factor variable. Then, perform factorization to remove all instances of i from the number. You can achieve this by repeatedly dividing the number by i as long as it's divisible.

Final Check: After the loop, if the number is equal to 1, it means the factorization has been completed successfully and the largest prime factor is stored in the factor variable. Return factor. If number is not 1, it means it is itself a prime number, so return number.*/

public class LargestPrime {
    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        int factor = -1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i != 0) {
                continue;
            }
            factor = i;
            while (number % i == 0) {
                number /= i;
            }
        }
        return number == 1 ? factor : number;
    }
}
