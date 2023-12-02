package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-22 09:48:35
 * @link https://leetcode.com/problems/implement-trie-prefix-tree/
 */
public class T208ImplementTriePrefixTree {

    public static void main(String[] args) {
        Solution solution = new T208ImplementTriePrefixTree().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)

class Node {
        Node[] children;
        boolean isWord;
        Node() {
            children = new Node[26];
        }
}
class Trie {
    Node root;

    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); ++i) {
            int index = word.charAt(i) - 'a';
            if (current.children[index] == null) {
                current.children[index] = new Node();
            }
            current = current.children[index];
        }
        current.isWord = true;
    }
    
    public boolean search(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); ++i) {
            int index = word.charAt(i) - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return current.isWord;
    }
    
    public boolean startsWith(String prefix) {
        Node current = root;
        for (int i = 0; i < prefix.length(); ++i) {
            int index = prefix.charAt(i) - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
//leetcode submit region end(Prohibit modification and deletion)

}