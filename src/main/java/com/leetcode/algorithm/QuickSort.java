package com.leetcode.algorithm;

/**
 * @author lidongmeng
 * Created on 2023-02-03
 */
public class QuickSort {
    private int[] nums;

    public static void main(String[] args) {
        int[] nums = {5, 9, 9, 1, 4, 2};
        QuickSort quickSort = new QuickSort(nums);
        quickSort.sort();
    }

    QuickSort(int[] nums) {
        this.nums = nums;
    }

    public void sort() {
        System.out.println("sort before:\n" + this);
        quickSort(0, nums.length - 1);
        System.out.println("sort after:\n" + this);
    }

    void quickSort(int l, int r) {
        if (l > r) return ;
        int p = partition(l, r);
        quickSort(l, p - 1);
        quickSort(p + 1, r);
    }

    private int partition(int l, int r) {
        int pivot = nums[l];
        while (l < r) {
            while (l < r && nums[r] >= pivot) --r;
            if (l < r) {
                nums[l++] = nums[r];
            }

            while (l < r && nums[l] < pivot) ++l;
            if (l < r) {
                nums[r--] = nums[l];
            }
        }
        nums[l] = pivot;
        return l;
    }

    @Override
    public String toString() {
        String data = "";
        for (int num: nums) {
            data += " " + num;
        }
        return data;
    }
}
