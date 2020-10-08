package edu.cnm.deepdive;

import java.math.BigInteger;

public class Factorials {

  public static long computeRecursive(int n) throws IllegalArgumentException {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    return (n <= 1) ? 1 : (n * computeRecursive(n - 1));
  }

  public static BigInteger computeRecursiveBig (BigInteger n) throws IllegalArgumentException {
    if (n.compareTo(BigInteger.ZERO) < 0) {
      throw new IllegalArgumentException();
    }
    return (n.compareTo(BigInteger.ONE) <= 0)
        ? BigInteger.ONE
        : n.multiply(computeRecursiveBig(n.subtract(BigInteger.ONE)));
  }

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
