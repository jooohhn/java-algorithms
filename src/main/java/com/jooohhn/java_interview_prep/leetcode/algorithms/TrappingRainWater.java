package com.jooohhn.java_interview_prep.leetcode.algorithms;

/**
 * @TODO: Finish #42 Hard
 *
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it is able to trap after raining.
 *
 * Observations 1) A index (square) can be filled if somewhere to the left and somewhere to the
 * right there exists a block 2) If a block is to be a wall of a filled index, then there must be a
 * complimenting block of equal or greater height 3) The amount an index can hold ==
 * minHeight(leftWall, rightWall) 4) If two consecutive nodes have the same height, make the right
 * node the left wall 5) If no such rightWall exists, move onto next node 5) Once a rightWall is
 * identified, all indices in between leftWall and rightWall have been calculated and can be ignored
 * 6)
 *
 * Algorithm 1) Given a leftWall 2) Find the highest complimenting wall; rightWall =
 * highestCompliment - If heights[i] >= leftWall, let that be rightWall. Can't calculate depths to
 * the right of it - if no such wall exists, continue - If during search, hit the end of the array,
 * if no rightWall >= leftWall, return (means that there exists no valid wall. Would just overflow
 * 3) For each index in between leftWall and rightWall, calculate the amount of water for it - Will
 * be using the height of that current index 4)
 */
public class TrappingRainWater {}
