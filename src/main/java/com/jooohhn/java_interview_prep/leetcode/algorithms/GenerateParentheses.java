package com.jooohhn.java_interview_prep.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @TODO: Finish #22 Medium
 *
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed
 * parentheses.
 *
 * Observations 1) Brute force: Generate all permutations of the parentheses (bad) 2) Repeated
 * work: If some substring is invalid, then you don't
 */
public class GenerateParentheses {
  public static List<String> generateParenthesis(int n) {
    List<String> list = new ArrayList<String>();
    backtrack(list, "", 0, 0, n);
    return list;
  }

  public static void backtrack(List<String> list, String str, int open, int close, int max){

    if(str.length() == max*2){
      list.add(str);
      return;
    }

    if(open < max)
      backtrack(list, str+"(", open+1, close, max);
    if(close < open)
      backtrack(list, str+")", open, close+1, max);
  }

  public static void main(String[] args) {
    System.out.println(generateParenthesis(4));
  }
}
