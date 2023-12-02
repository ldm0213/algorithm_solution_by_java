package com.leetcode.editor.cn;

import java.util.Iterator;

/**
 * @author  lidongmeng
 * @date 2023-11-22 19:40:15
 * @link https://leetcode.com/problems/peeking-iterator/
 */
public class T284PeekingIterator {

    public static void main(String[] args) {
        Solution solution = new T284PeekingIterator().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
	Iterator<Integer> iter;
	Integer next;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    iter = iterator;
		if (iterator.hasNext()) next = iter.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return next;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer result = next;
		next = iter.hasNext() ? iter.next() : null;
		return result;
	}
	
	@Override
	public boolean hasNext() {
	    return next != null;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}