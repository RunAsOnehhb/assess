package com.assess.intern;

/**
 * @Author: RunAsOne
 * @Date: 2020/11/23 11:04
 */

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * <p>
 * 进阶：你可以设计并实现时间复杂度为 O(n) 的解决方案吗？
 * <p>
 * 示例 1：
 * 输入：nums = [100,4,200,1,3,2]
 * 输出：4
 * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
 * <p>
 * 示例 2：
 * 输入：nums = [0,3,7,2,5,8,4,6,0,1]
 * 输出：9
 * <p>
 * 提示：
 * <p>
 * 0 <= nums.length <= 10^4
 * -10^9 <= nums[i] <= 10^9
 */
public class Continue {
    public static int num(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            //TreeSet有序排放
            set.add(num);
        }
        int length = 1;
        TreeSet<Integer> numSet = new TreeSet<>();
        for (int num : set) {
            if (set.contains(num + 1)) {
                length = length + 1;
            } else {
                //如果set中不包含num+1 说明他已经到尽头了 重新一个长度来计算
                numSet.add(length);
                length = 1;
            }
        }
        //把按顺序排的set转化为list
        List<Integer> list = new ArrayList<>(numSet);
        if (list.isEmpty()) {
            return 0;
        }
        //因为treeSet按顺序排的所以最后一位就是最大值
        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,-1};
        System.out.println(num(nums));
    }
}
