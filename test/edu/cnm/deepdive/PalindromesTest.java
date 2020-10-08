package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLOutput;
import org.junit.jupiter.api.Test;

public class PalindromesTest {

  static final String[] inputValues = {
    "radar", "sonar", "abba", "abb", "x", ""
  };

  static final boolean[] expectedValues = {
    true, false, true, false, true, true
  };

  static final String[] denormalizeInputs = {
      "radar",
      "Radar",
      "A man, a plan, a canal - Panama!",
      "A man, a plan, a dam - Hoover!",
      "aBbA"
  };

  static final boolean[] denormalizeExpecteds = {
      true, true, true, false, true
  };

  @Test
  void testRecursive() {
    for (int i = 0; i < inputValues.length; i++) {
      assertEquals(expectedValues[i], Palindromes.testRecursive(inputValues[i]));
    }
  }

  @Test
  void testDenormalized() {
    for (int i = 0; i < denormalizeInputs.length; i++) {
      assertEquals(denormalizeExpecteds[i], Palindromes.testDenormalized(denormalizeInputs[i]));
    }
  }

  @Test
  void testIterative() {
    for (int i = 0; i < inputValues.length; i++) {
      assertEquals(expectedValues[i], Palindromes.testIterative(inputValues[i]));
    }
  }

}
