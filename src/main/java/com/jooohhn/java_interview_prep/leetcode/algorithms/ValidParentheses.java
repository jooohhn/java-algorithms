package com.jooohhn.java_interview_prep.leetcode.algorithms;

import java.util.Stack;

/**
 * #20 Easy
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if
 * the input string is valid. The brackets must close in the correct order, "()" and "()[]{}" are
 * all valid but "(]" and "([)]" are not.
 *
 * Solution: Use a stack to push (, {, [ symbols. If a ), }, or ] symbol is met, see if stack is
 * still full and the corresponding opening character is matched @Time: O(n) where n is the length
 * of the string @Space: O(n) where n is the length of the string
 */
public class ValidParentheses {

  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      Character c = s.charAt(i);
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else if (c == ')') {
        if (stack.size() == 0 || stack.pop() != '(') {
          return false;
        }
      } else if (c == '}') {
        if (stack.size() == 0 || stack.pop() != '{') {
          return false;
        }
      } else if (c == ']') {
        if (stack.size() == 0 || stack.pop() != '[') {
          return false;
        }
      } else {
        return false;
      }
    }

    if (stack.size() != 0) {
      return false;
    }
    return true;
  }
}
