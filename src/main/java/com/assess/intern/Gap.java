package com.assess.intern;

/**
 * @Author: RunAsOne
 * @Date: 2020/11/23 13:53
 */

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * 给定一个无序的数组，找出数组在排序之后，相邻元素之间最大的差值。
 * <p>
 * 如果数组元素个数小于 2，则返回 0。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,6,9,1]
 * 输出: 3
 * 解释: 排序后的数组是 [1,3,6,9], 其中相邻元素 (3,6) 和 (6,9) 之间都存在最大差值 3。
 * 示例 2:
 * <p>
 * 输入: [10]
 * 输出: 0
 * 解释: 数组元素个数小于 2，因此返回 0。
 * 说明:
 * <p>
 * 你可以假设数组中所有元素都是非负整数，且数值在 32 位有符号整数范围内。
 * 请尝试在线性时间复杂度和空间复杂度的条件下解决此问题。
 */
public class Gap {

    public static int Gap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        //先让这个数组有顺序
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : nums) {
            treeSet.add(num);
        }
        //把这个set转化为list
        List<Integer> list = new ArrayList(treeSet);

        TreeSet<Integer> gapSet = new TreeSet<>();
        int gap;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) > list.get(i)) {
                gap = list.get(i + 1) - list.get(i);
                //把每相邻的两个值的差放在treeSet里
                gapSet.add(gap);
            }
        }
        //把按顺序排的set转化为list
        List<Integer> maxGap = new ArrayList(gapSet);
        if (maxGap.isEmpty()) {
            return 0;
        }
        //因为treeSet按顺序排的所以最后一位就是最大值
        return maxGap.get(maxGap.size() - 1);
    }
    public static void main(String[] args) {
        int[] nums = new int[]{0,-1};
        System.out.println(Gap(nums));
    }
}
