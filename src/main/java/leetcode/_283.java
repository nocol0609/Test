package leetcode;

import leetcode.common.ArrayUtils;

/**
 * @author liuxp
 * @version 1.0
 * @date 2020/4/12 23:12
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 *
 */
public class _283 {

    public static void main(String[] args) {
        int[] nums1=new int[]{0,1,0,3,12};
        ArrayUtils.printArray(nums1);
        moveZeroes(nums1);
        ArrayUtils.printArray(nums1);
    }

    public static void moveZeroes(int[] nums) {
        if(nums==null || nums.length==0){
            return;
        }
        //0,1,0,3,12
        //1,3,12,0,0
        int originLength=nums.length;
        int slow=0;
        for(int fast=0;fast<nums.length;fast++){
            if(nums[fast]!=0){
                nums[slow]=nums[fast];
                slow++;
            }
        }
    }
}
