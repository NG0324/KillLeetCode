package LeetCode3_10;/*
 * @Date:2023/3/10-18:41
 * @Description:
 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。

不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。

元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

 

说明:

为什么返回数值是整数，但输出的答案是数组呢?

请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。

你可以想象内部操作如下:

// nums 是以“引用”方式传递的。也就是说，不对实参作任何拷贝
int len = removeElement(nums, val);

// 在函数里修改输入数组对于调用者是可见的。
// 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
for (int i = 0; i < len; i++) {
    print(nums[i]);
}

 * @Param:
 */

public class Class27 {
    public int removeElement(int[] nums, int val) {
        int length = 0;
        int d = nums.length;
        for (int i = 0; i < d; ) {
            if (nums[i]==val){
                //移动后续所有元素
                for (int j = i+1; j < d; j++) {
                    nums[j-1] = nums[j];
                }
                d--;

            }
            else {
                length++;
                i++;
            }
        }
        for (int i=0;i<length;i++){
            System.out.println(nums[i]);
        }
        return length;
    }
    public int removeElement2(int[] nums, int val) {//失败的想法
        int length = 0;
        int d = nums.length;
        int j=0;
        int gap = 0;
        for (int i = 0; i < nums.length; ) {
            if (nums[i]==val){
                //移动后续所有元素
//                for (j = i+1; j < d; j++) {
//                    nums[j-1] = nums[j];
//                }
                gap++;
                nums[i] = nums[i+gap];
                d--;
                i = i+gap;
            }

            else {
                length++;
                i++;
            }
        }


        for (int i=0;i<length;i++){
            System.out.println(nums[i]);
        }
        return length;
    }
    public int removeElement3(int[] nums, int val) {//最佳解-双指针
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}
