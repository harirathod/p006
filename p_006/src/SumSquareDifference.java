/**
 * This class is part of Project Euler, and focuses on problem 6 from Project Euler.
 * There are two methods which calculates the difference of the square of the sum of the first 100 natural numbers, and
 * the sum of the squares of the first 100 natural numbers.
 */
public class SumSquareDifference {

    public static void main(String[] args)      // main method
    {
        System.out.println(squareOfSum() - sumOfSquares());
    }

    /**
     * Calculates and returns the square of the sum of the first 100 natural numbers i.e., (1 + 2 + ... + 100)^2.
     * @return The square of the sum of the first 100 natural numbers.
     */
    private static int squareOfSum()                   // calculate the square of the sum of the first 100 natural numbers
    {
        int squareOfSum = 0;
        int i = 1;
        while(i < 101) {
            squareOfSum += i;
            i++;
        }
        return (int) Math.pow(squareOfSum, 2);
    }

    /**
     * Calculates and returns the sum of the squares of the first 100 natural numbers i.e., (1^2 + 2^2 + ... + 100^2).
     * @return The sum of the square of the first 100 natural numbers.
     */
    private static int sumOfSquares()                  // calculate the sum of squares of the first 100 natural numbers
    {
        int sumOfSquares = 0;
        int i = 1;
        while(i < 101) {
            sumOfSquares += Math.pow(i, 2);
            i ++;
        }
        return sumOfSquares;
    }
}
