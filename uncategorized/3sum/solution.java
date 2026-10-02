1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums);
4        List<List<Integer>> list = new ArrayList<>();
5        for (int i = 0; i < nums.length - 2; i++) {
6            int j = i + 1;
7            int k = nums.length - 1;
8
9            if (i > 0 && nums[i] == nums[i - 1]) {
10                continue;
11            }
12            while (j < k) {
13                int sum = nums[i] + nums[j] + nums[k];
14                if (sum < 0) {
15                    j++;
16                } else if (sum > 0) {
17                    k--;
18                } else {
19                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
20                    list.add(temp);
21                    j++;
22                    k--;
23                    while (j < k && nums[j] == nums[j - 1]) {
24                        j++;
25                    }
26                    while (j < k && nums[k] == nums[k + 1]) {
27                        k--;
28                    }
29                }
30            }
31        }
32        return list;
33    }
34}
35