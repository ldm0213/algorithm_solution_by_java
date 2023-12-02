package com.leetcode.editor.cn;

import java.io.StringReader;

/**
 * @author  lidongmeng
 * @date 2023-11-25 19:18:06
 * @link https://leetcode.com/problems/maximum-swap/
 */
public class T670MaximumSwap {

    public static void main(String[] args) {
        Solution solution = new T670MaximumSwap().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumSwap(int num) {
        //  由于希望置换后的数字最大，那么肯定最好的高位上的小数字和低位上的大数字进行置换，
        //  需要找到每个数字右边的最大数字(包括其自身)，这样再从高位像低位遍历，
        //  如果某一位上的数字小于其右边的最大数字，说明需要调换，由于最大数字可能不止出现一次，
        //  这里希望能跟较低位的数字置换，这样置换后的数字最大，所以就从低位向高位遍历来找那个最大的数字，找到后进行调换即可。
        String numStr = String.valueOf(num);
        int len = numStr.length();
        char[] ori = numStr.toCharArray();
        char[] biggerArr = numStr.toCharArray();
        for (int i = len - 2; i >= 0; --i) {
            biggerArr[i] = biggerArr[i] >= biggerArr[i+1] ? biggerArr[i] : biggerArr[i+1];
        }

        for (int i = 0; i < len; ++i) {
            if (ori[i] == biggerArr[i]) continue;
            for (int j = len - 1; j >= i; --j) {
                if (ori[j] == biggerArr[i]) {
                    char tmp = ori[i];
                    ori[i] = ori[j];
                    ori[j] = tmp;
                    return Integer.valueOf(new String(ori));
                }
            }
        }
        return Integer.valueOf(new String(ori));
    }


    void swap(char[] arr, int i, int j) {
        char ch = arr[i];
        arr[i] = arr[j];
        arr[j] = ch;
    }
    public int maximumSwapV1(int num) {
        // 暴力对于每个交换的可能交换获取结果
        char[] numArr = String.valueOf(num).toCharArray();
        String result = String.valueOf(num);
        for (int i = 0; i < numArr.length; ++i) {
            for (int j = i + 1; j < numArr.length; ++j) {
                swap(numArr, i, j);
                result = String.valueOf(Math.max(Integer.valueOf(result), Integer.valueOf(new String(numArr))));
                swap(numArr, i, j);
            }
        }
        return Integer.valueOf(result);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}