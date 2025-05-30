public class FlourPacker {
    /*Flour Pack Problem
Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.

The parameter bigCount represents the count of big flour bags (5 kilos each).

The parameter smallCount represents the count of small flour bags (1 kilo each).

The parameter goal represents the goal amount of kilos of flour needed to assemble a package.

Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal. The method should return true if it is possible to make a package with goal kilos of flour.

If the sum is greater than goal, ensure that only full bags are used towards the goal amount. For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since each big bag is 5 kilos and cannot be divided. However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal, and it's okay if there are additional bags left over.

If any of the parameters are negative, return false.



EXAMPLE INPUT/OUTPUT:

canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.

canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.

canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.

canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.

canPack (-3, 2, 12); should return false since bigCount is negative.

*/

    /*There are several ways you can implement this method.  This is one way to do it.



Understand the Problem: Make sure you understand the problem statement and what the method is supposed to do. In this case, the method is determining if you can pack flour bags of given sizes to reach a specified goal weight.

Handling Invalid Inputs: The first step is to handle the case of invalid inputs, where any of the input values (bigCount, smallCount, goal) is negative. If any of them is negative, return false.

Calculating Total Big Weight: Calculate the total weight of the big flour bags by multiplying bigCount with the BIG_WEIGHT constant.

Comparing Total Big Weight and Goal: Compare the totalBigWeight with the goal. If totalBigWeight is greater than or equal to the goal, it means you have enough big flour bags to potentially reach the goal.

Checking Remaining Weight: If totalBigWeight is greater than or equal to the goal, calculate the remaining weight needed to reach the goal by finding the remainder of goal divided by BIG_WEIGHT.

Comparing with Small Count: Check if you have enough small flour bags (smallCount) to cover the remaining weight calculated in the previous step. If smallCount is greater than or equal to the remaining weight, it means you can pack the bags to reach the goal.

Checking the Other Case: If totalBigWeight is less than the goal, you'll need to consider using both big and small flour bags. Calculate the weight that can be fulfilled using big flour bags (goal - totalBigWeight). Then check if you have enough small flour bags (smallCount) to cover the remaining weight.

Return the Result: Based on the above conditions, set the result variable to true if packing is possible, and return it at the end of the method.*/

    private static final int BIG_WEIGHT = 5;

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean result = false;
        int totalBigWeight = bigCount * BIG_WEIGHT;
        if (totalBigWeight >= goal) {
            int remaining = goal % BIG_WEIGHT;
            if (smallCount >= remaining) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }
        return result;
    }
}
