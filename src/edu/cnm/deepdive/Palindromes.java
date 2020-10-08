package edu.cnm.deepdive;

public class Palindromes {

  public static boolean testRecursive(String phrase) {
    return phrase.length() <= 1
        || (
            phrase.charAt(0) == phrase.charAt(phrase.length() - 1)
            && testRecursive(phrase.substring(1, phrase.length() - 1))
        );
  }

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
