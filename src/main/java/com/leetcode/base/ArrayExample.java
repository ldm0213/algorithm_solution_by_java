package com.leetcode.base;

import java.util.Arrays;

/**
 * @author lidongmeng
 * Created on 2023-02-02
 */
public class ArrayExample {
    public static void main(String[] args) {
        init();
        sortOperation();
        mathOperation();
    }

    public static void init() {
        // 先申请空间在初始化
        int[] nums1 = new int[5];
        for (int i = 0; i < 5; ++i) {
            nums1[i] = i;
        }

        // 直接申请空间+初始化
        int[] nums2 = new int[]{1, 2, 3, 4, 5};
        int[] nums3 = {2, 3, 4, 5};

        int[][] num4 = {
                {1, 2, 3},
                {4, 5, 6}
        };
    }

    public static void sortOperation() {
        int[] nums = {6, 9, 10, 3, 2, 5};
        System.out.println("排序前：" + Arrays.toString(nums));
        // Arrays.sort(nums);
        nums = Arrays.stream(nums).sorted().toArray();
        System.out.println("排序后：" + Arrays.toString(nums));

        // Comparator接收的不能是java基础类型，需要是包装类型
        Integer[] nums2 = {6, 9, 10, 3, 2, 5};
        Arrays.sort(nums2, (o1, o2) -> o2 - o1);
        System.out.println("排序后：" + Arrays.toString(nums2));
    }

    public static void mathOperation() {
        int[] nums = {6, 9, 10, 3, 2, 5};
        System.out.println("最小值:" + Arrays.stream(nums).min().getAsInt());
        System.out.println("最大值:" +Arrays.stream(nums).max().getAsInt());
        System.out.println("和:" +Arrays.stream(nums).sum());
    }
}