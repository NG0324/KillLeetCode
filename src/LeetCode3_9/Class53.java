package LeetCode3_9;/*
 * @Date:2023/3/9-16:46
 * @Description:
 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

子数组 是数组中的一个连续部分。


示例 1：

输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
输出：6
解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。

 * @Param:
 */

/**
 * @Date: 2023/3/9 16:47
 * @Function:
 * @Param:
 * @Return:全局变量max记录最大值，两个for，外层for循环表示从第i个数开始的连续数组，内部for逐个i增加并比较
 */
public class Class53 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i];
            if (max<=sum){
                max = sum;
        }
            for (int j = i; j < nums.length;) {
                j++;
                if (j!= nums.length){
                    if (sum + nums[j] >= sum){
                        sum = sum + nums[j];
                        if (max<=sum)
                            max = sum;
                    }
                    else {
                        sum = sum + nums[j];
                    }
                }
            }
        }

        return max;
    }
}
