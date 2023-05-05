package com.leetcode.algorithm;

/**
 * @author lidongmeng
 * Created on 2023-02-03
 *
 * PriorityQueue: https://www.cnblogs.com/huansky/p/13584622.html
 */
public class HeapSort {
    private int[] nums;
    private int size;

    public static void main(String[] args) {
        int[] nums = {5, 9, 1, 4, 2};
        HeapSort heapSort = new HeapSort(nums);
        heapSort.sort();
    }

    HeapSort(int[] nums) {
        this.nums = nums;
        size = nums.length;
    }

    public void sort() {
        System.out.println("sort before:\n" + this);
        heapify();
        System.out.println("heapify:\n" + this);
        // O(nlogn)
        for (int i = size - 1; i > 0; --i) {
            int tmp = nums[i];
            nums[i] = nums[0];
            nums[0] = tmp;
            siftDown(0, i);
        }
        System.out.println("sort after:\n" + this);
    }

    private void heapify() {
        for (int i = size >>> 1 - 1; i >= 0; --i) {
            siftDown(i, size);
        }
    }

    private void siftDown(int index, int len) {
        int half = len >>> 1;
        while (index < half) {
            int l = (index << 1) + 1;
            int r = (index << 1) + 2;
            int maxIndex = index;
            if (l < len && nums[l] > nums[maxIndex]) maxIndex = l;
            if (r < len && nums[r] > nums[maxIndex]) maxIndex = r;
            if (maxIndex != index) {
                int tmp = nums[index];
                nums[index] = nums[maxIndex];
                nums[maxIndex] = tmp;
                index = maxIndex;
            } else {
                break;
            }
        }
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
