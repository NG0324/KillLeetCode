package LeetCode3_9;/*
 * @Date:2023/3/9-16:15
 * @Description:
 * @Param:
 */

import org.testng.annotations.Test;

public class LeetcodeTest {
    @Test
    public void test217(){
        Class217 class217 = new Class217();
        int nums[]={1,4,3,2,4};
        System.out.println(class217.containsDuplicate(nums));

    }
    @Test
    public void test53(){
        Class53 class53 =new Class53();
        int nums[] = {5,4,-1,7,8};
        System.out.println(class53.maxSubArray(nums));
    }
    @Test
    public void test704(){
        Class704 class704 =new Class704();
        int nums[] = {-1,0,3,5,9,12};
        System.out.println(class704.search(nums,4));
    }
}
