package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-21 21:22:48
 * @link https://leetcode.com/problems/add-digits/
 */
public class T258AddDigits {

    public static void main(String[] args) {
        Solution solution = new T258AddDigits().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int getNext(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }

    public int addDigits(int num) {
        while (!(num >= 0 && num <= 9)) {
            num = getNext(num);
        }
        return num;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}