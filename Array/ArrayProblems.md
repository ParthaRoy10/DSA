# Contains Duplicate

##	 Problem 1:

### Problem Desription:

Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:

Input: nums = [1, 2, 3, 3]

Output: true

Example 2:

Input: nums = [1, 2, 3, 4]

Output: false

[Solution](Solutions/Solution1.java)

## Problem 2:

### Problem Desription:

Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true
Example 2:

Input: s = "jar", t = "jam"

Output: false

Constraints:

s and t consist of lowercase English letters.

[Solution](Solutions/Solution2.java)

## Problem 3:

## Problem Description:

Two Sum

Solved 

Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first.

Example 1:

Input:
 
nums = [3,4,5,6], target = 7

Output: [0,1]

Explanation: nums[0] + nums[1] == 7, so we return [0, 1].

Example 2:

Input: nums = [4,5,6], target = 10

Output: [0,2]

Example 3:

Input: nums = [5,5], target = 10

Output: [0,1]

### Solution :

I have used a hashmap to track the index of elements . 

Time complexity `O(n)` space complexity `O(n)`

[Solution](Solutions/Solution3.java)

## Problem 4:

### Problem Description :

Group Anagrams

Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: strs = ["act","pots","tops","cat","stop","hat"]

Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]

Example 2:

Input: strs = ["x"]

Output: [["x"]]

Example 3:

Input: strs = [""]

Output: [[""]]

### Solution :

To solve the problem I have created an Map of HashMap and List . That will track the unique frequencies and the corresponding words.

After populating the frequency table of all the strings it cheaks if the frequency table is present in our Map or not . If present then it simply adds the string to the list that has the same frequency with the key. If not present then it simply adds the frequency table and a new list to the map.

[Solution](Solutions/Solution4.java)

## Problem 5:

### Problem Description:

Top K Frequent Elements

Given an integer array nums and an integer k, return the k most frequent elements within the array.

The test cases are generated such that the answer is always unique.

You may return the output in any order.

Example 1:

Input: nums = [1,2,2,3,3,3], k = 2

Output: [2,3]

Example 2:

Input: nums = [7,7], k = 1

Output: [7]

Constraints:

1 <= nums.length <= 10^4.

-1000 <= nums[i] <= 1000

1 <= k <= number of distinct elements in nums.

### Solution :

To solve the Problem I have used bucket sorting . 

First crete the possible buckets according to the frequency.

Then Simply create the result List.

[Solution](Solutions/Solution5.java)