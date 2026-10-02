# Two Sum

## Problem
https://leetcode.com/problems/two-sum/

## Difficulty
Easy

## Topics
Array, Hash Table

## Approach
Single pass with a hash map of seen values.

## Key Observation
For each value, its complement is already seen.

## Why It Works
Each index is stored once, so lookups are O(1).

## Complexity
Time: O(n)
Space: O(n)

## Important Theory
["Hash map", "Complement problem"]

## Common Mistakes
["Off-by-one when checking the complement"]

## Edge Cases
["Empty array", "Duplicate values"]

## Revision Questions
- Why is a hash map needed?
- What if the array is sorted?
