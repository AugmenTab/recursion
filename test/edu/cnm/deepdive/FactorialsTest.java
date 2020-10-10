package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

/**
 * Series of tests for the Factorials class methods.
 */
public class FactorialsTest {
  
  static final int[] inputValues = {
      0,
      1,
      5,
      10,
      13
  };
  
  static final long[] expectedValues = {
      1,
      1,
      120,
      3628800,
      6227020800L,
  };

  @Test
  void computeRecursive() {
    for (int i = 0; i < inputValues.length; i++) {
      int input = inputValues[i];
      long expected = expectedValues[i];
      long actual = Factorials.computeRecursive(input);
      assertEquals(expected, actual);
    }
  }

  @Test
  void computeRecursive_negative() {
    assertThrows(IllegalArgumentException.class, () -> Factorials.computeRecursive(-1));
  }

  @Test
  void computeRecursiveBig() {
    for (int i = 0; i < inputValues.length; i++) {
      BigInteger input = BigInteger.valueOf(inputValues[i]);
      BigInteger expected = BigInteger.valueOf(expectedValues[i]);
      assertEquals(expected, Factorials.computeRecursiveBig(input));
    }
  }

  @Test
  void computeIterative() {
    for (int i = 0; i < inputValues.length; i++) {
      int input = inputValues[i];
      long expected = expectedValues[i];
      long actual = Factorials.computeIterative(input);
      assertEquals(expected, actual);
    }
  }

  @Test
  void computeIterative_negative() {
    assertThrows(IllegalArgumentException.class, () -> Factorials.computeIterative(-1));
  }

}