package LeetCode3_9;/*
 * @Date:2023/3/9-15:57
 * @Description:
 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。

示例 1：

输入：nums = [1,2,3,1]
输出：true
示例 2：

输入：nums = [1,2,3,4]
输出：false

 * @Param:
 */

import java.util.HashMap;

/**
 * @Date: 2023/3/9 15:59
 * @Function:
 * @Param:
 * @Return:思路：new一个Map，key存nums内数字，value存次数time，当遇到time>=2的时候就不再存，直接return true
 */
public class Class217 {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])){
                Integer value = map.get(nums[i])+1;
                map.replace(nums[i],value);
                if (map.get(nums[i])>=2)
                    return true;
            }
            else map.put(nums[i],1);

        }

        return false;
    }
}
