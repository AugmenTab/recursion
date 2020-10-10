package edu.cnm.deepdive;

import java.math.BigInteger;

/**
 * Computes the factorial of a given number using a variety of methods and input types. Approaches
 * the computation of integer factorials using recursion and iteration, as well as using recursion
 * to calculate the factorial of a BigInteger.
 */
public class Factorials {

  /**
   * Calculates the factorial of an integer using recursion.
   *
   * @param n Integer to calculate factorial.
   * @return The calculated factorial of n as an integer.
   * @throws IllegalArgumentException Exception thrown when receiving a non-integer as input.
   */
  public static long computeRecursive(int n) throws IllegalArgumentException {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    return (n <= 1) ? 1 : (n * computeRecursive(n - 1));
  }

  /**
   * Calculates the factorial of a BigInteger using recursion.
   *
   * @param n BigInteger to calculate factorial.
   * @return The calculated factorial of n as a BigInteger.
   * @throws IllegalArgumentException Exception thrown when receiving a non-BigInteger as input.
   */
  public static BigInteger computeRecursiveBig (BigInteger n) throws IllegalArgumentException {
    if (n.compareTo(BigInteger.ZERO) < 0) {
      throw new IllegalArgumentException();
    }
    return (n.compareTo(BigInteger.ONE) <= 0)
        ? BigInteger.ONE
        : n.multiply(computeRecursiveBig(n.subtract(BigInteger.ONE)));
  }

  /**
   * Calculates the factorial of an integer using iteration.
   *
   * @param n Integer to calculate factorial.
   * @return The calculated factorial of n as an integer.
   * @throws IllegalArgumentException Exception thrown when receiving a non-integer as input.
   */
  public static long computeIterative(int n) throws IllegalArgumentException {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    long product = 1;
    for (int i = 1; i <= n; i++) {
      product *= i;
    }
    return product;
  }

}
