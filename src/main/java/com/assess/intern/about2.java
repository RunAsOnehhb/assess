package com.assess.intern;

/**
 * @Author: RunAsOne
 * @Date: 2020/11/23 10:05
 */

/**
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1
 * 输出: true
 * 解释: 20 = 1
 * 示例 2:
 * <p>
 * 输入: 16
 * 输出: true
 * 解释: 24 = 16
 * 示例 3:
 * <p>
 * 输入: 218
 * 输出: false
 */
public class about2 {

    public static boolean test(int number) {
        //如果一个二进制数的第n位是1，而其他各位都是0，那么这个数等于2^n
        return number > 0 && (number & (number - 1)) == 0;
    }

    public static void main(String[] args) {

        System.out.println(test(256));
    }
}
