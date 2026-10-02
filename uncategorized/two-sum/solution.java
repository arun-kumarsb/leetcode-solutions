1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        for (int i = 0; i < nums.length; i++) {
5            int complement = target - nums[i];
6
7            if (map.containsKey(complement)) {
8                return new int[] { map.get(complement), i };
9            }
10            map.put(nums[i], i);
11        }
12        return new int[] {};
13    }
14
15    // public int[] twoSum(int[] nums, int target) {
16    //     for(int i = 0; i < nums.length; i++){
17    //         for(int j = i + 1; j < nums.length; j++){
18    //             if((nums[i] + nums[j]) == target){
19    //                 return new int[] {i,j};
20    //             }
21    //         }
22    //     }
23    //     return new int[]{};
24    // }
25}