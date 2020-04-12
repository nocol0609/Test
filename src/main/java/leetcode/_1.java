package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：liuxp
 * @date ：Created in 2020/1/3 8:38
 * @description ：两数之和
 *
 *                  给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 *                  你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 */
 class _1 {
    public static void main(String[] args) {
        int[] nums={2, 7, 11, 15};
        int target=9;
        //int[] ints = twoSum(nums, target);
        int[] ints = twoSum2(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        int[] result=new int[2];
        for (int i=0;i<nums.length;i++){
            int numTwo=target-nums[i];
            if(map.get(numTwo)!=null){
                result[0]=map.get(numTwo);
                result[1]=i;
            }else {
                map.put(nums[i],i);
            }
        }
        return result;
    }

    private static int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            int numTwo=target-nums[i];
            if(null!=map.get(numTwo)){
                result[0]=map.get(numTwo);
                result[1]=i;
            }else {
                map.put(nums[i],i);
            }
        }
        return result;
    }


}
