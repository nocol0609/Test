package leetcode.math;

/**
 * @author liuxp
 * @version 1.0
 * @date 2020/4/12 12:52
 *
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 *
 *
 */
public class _9 {

    public static void main(String[] args) {
        int num=1221;
        boolean palindrome = isPalindrome(num);
        System.out.println(">>>>"+palindrome);
    }


    private static boolean isPalindrome(int x) {
        Boolean flag=false;
        if (x < 0 ) {
            return false;
        }
        int originX=x;
        int reverseNum = 0;
        while(x != 0) {
            reverseNum = reverseNum * 10 + x %10;
            x = x/ 10;
        }
        //翻转之后与原数对比
        if(originX == reverseNum){
            flag=true;
        }
        return flag;
    }


    public static boolean isPalindrome1(int x) {
        Boolean flag=false;
        String numStr=String.valueOf(x);
        String temp=new StringBuffer(numStr).reverse().toString();
        if(numStr.equals(temp)){
            flag=true;
        }
        return flag;
    }

}
