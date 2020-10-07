package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PalindromesTest {

  static final String[] inputValues = {
    "radar", "sonar", "abba", "abb", "x", ""
  };

  static final boolean[] expectedValues = {
    true, false, true, false, true, true
  };

  @Test
  void computeRecursive() {
    for (int i = 0; i < inputValues.length; i++) {
      assertEquals(expectedValues[i], Palindromes.testRecursive(inputValues[i]));
    }
  }

}
