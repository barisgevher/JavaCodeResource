public class DiagonalStar {
    /*Diagonal Star
Write a method named printSquareStar with one parameter of type int named number.

If number is < 5, the method should print "Invalid Value".

The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).



EXAMPLE INPUT/OUTPUT:

EXAMPLE 1

printSquareStar(5); should print the following:

→ NOTE: For text in Code Blocks below, use code icon {...}  on Udemy

*****
** **
* * *
** **
*****

Explanation:

*****   5 stars
** **   2 stars space 2 stars
* * *   1 star space 1 star space 1 star
** **   2 stars space 2 stars
*****   5 stars


EXAMPLE 2

printSquareStar(8); should print the following:

********
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
********


The patterns above consist of a number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four conditions (Read them carefully):

In the first or last row

In the first or last column

When the row number equals the column number

When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)



HINT: Use a nested loop (a loop inside of a loop).

HINT: To print on the same line, use the print method instead of println, e.g. System.out.print(" "); prints a space and does not "move" to another line.

HINT: To "move" to another line, you can use an empty println call, e.g. System.out.println(); .

NOTE: The method printSquareStar ​should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.*/
    /*There are several ways you can implement this method.  This is one way to do it.



Validate Input: Before proceeding, ensure the input number is valid (greater than or equal to 5).

Nested Loop: Use nested loops to iterate through each row and column of the square.

Identify Positions: Determine the positions where you need to print a star (*) and where to print a space ( ).

Conditions: You can use conditional statements to check whether the current position should have a star or a space based on whether it's on the first/last row or column, or on the diagonal.

Print Characters: Inside the inner loop, use the System.out.print() method to print either a star or a space character based on your conditions.

Line Break: After printing characters for a row, use System.out.println() to move to the next line before proceeding to the next row.*/

    public static void main(String[] args) {
        printSquareStar(15);
    }

    private static final String STAR = "*";
    private static final String SPACE = " ";

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        // Iterate over each row
        for (int row = 1; row <= number; row++) {
            // Iterate over each column
            for (int column = 1; column <= number; column++) {
                // if either row or column equals 1, assign true to isFirstRowOrColumn.
                boolean isFirstRowOrColumn = row == 1 || column == 1;
                // if either row or column equals number, assign true to isLastRowOrColumn.
                boolean isLastRowOrColumn = row == number || column == number;
                // if either row equals column, or column equals number minus row plus 1, assign true to isFirstRowOrColumn.
                boolean isDiagonal = (row == column) || (column == (number - row + 1));

                if (isFirstRowOrColumn || isLastRowOrColumn || isDiagonal) {
                    System.out.print(STAR);
                } else {
                    System.out.print(SPACE);
                }
            }
            // Move to the next line
            System.out.println();
        }
    }
}
