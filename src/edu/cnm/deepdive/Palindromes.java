package edu.cnm.deepdive;

/**
 * Tests a String to determine if it is a palindrome using a variety of methods. Approaches to
 * testing for palindrome status of a String using recursion and iteration. Denormalization method
 * is included to test Strings that contain whitespace, punctuation, and/or capital letters.
 */
public class Palindromes {

  /**
   * Tests whether a given String is a palindrome using recursion. Note: the given String must be
   * all lower case, with no whitespace or punctuation, in order to function properly.
   *
   * @param phrase The String to be tested.
   * @return Boolean value for whether the phrase is a palindrome.
   */
  public static boolean testRecursive(String phrase) {
    return phrase.length() <= 1
        || (
            phrase.charAt(0) == phrase.charAt(phrase.length() - 1)
            && testRecursive(phrase.substring(1, phrase.length() - 1))
        );
  }

  /**
   * Strips all whitespaces and punctuation from a given String, turns all of its characters to
   * lower case, then sends it to {@code testRecursive} to test if it is a palindrome.
   *
   * @param phrase The String to be denormalized and tested.
   * @return Calls {@code testRecursive}, which itself returns a boolean value for whether the
   * phrase is a palindrome.
   */
  public static boolean testDenormalized(String phrase) {
    String formattedString = phrase.replaceAll("[\\W_]+", "").toLowerCase();
    return testRecursive(formattedString);
  }

  /**
   * Tests whether a given String is a palindrome using iteration. Note: the given String must be
   * all lower case, with no whitespace or punctuation, in order to function properly.
   *
   * @param phrase The String to be tested.
   * @return Boolean value for whether the phrase is a palindrome.
   */
  public static boolean testIterative(String phrase) {
    boolean isPalindrome = true;
    for (int i = 0; i < (int)Math.floor(phrase.length() / 2); i++) {
      if (phrase.charAt(i) != (phrase.charAt(phrase.length() - (i + 1)))) {
        isPalindrome = false;
        break;
      }
    }
    return isPalindrome;
  }

}
