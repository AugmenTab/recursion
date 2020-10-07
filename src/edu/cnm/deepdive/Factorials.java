package edu.cnm.deepdive;

public class Factorials {

  public static long computeRecursive (int n) throws IllegalArgumentException {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    return (n <= 1) ? 1 : n * computeRecursive(n - 1);
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
