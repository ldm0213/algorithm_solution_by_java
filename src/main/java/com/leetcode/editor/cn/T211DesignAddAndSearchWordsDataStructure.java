package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-03 16:09:13
 * @link https://leetcode.com/problems/design-add-and-search-words-data-structure/
 */
public class T211DesignAddAndSearchWordsDataStructure {

    public static void main(String[] args) {
        Solution solution = new T211DesignAddAndSearchWordsDataStructure().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class TrieNode {
        TrieNode[] nodes;
        boolean isWord;
        TrieNode() {
            nodes = new TrieNode[26];
            isWord = false;
        }
    }
class WordDictionary {
    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); ++i) {
            char ch = word.charAt(i);
            if (current.nodes[ch - 'a'] == null) {
                current.nodes[ch - 'a'] = new TrieNode();
            }
            current = current.nodes[ch - 'a'];
        }
        current.isWord = true;
    }

    private boolean helper(String word, int pos, TrieNode node) {
        if (pos == word.length()) return node.isWord;
        char ch = word.charAt(pos);
        if (ch == '.') {
            for (int i = 0; i < 26; ++i) {
                if (node.nodes[i] != null && helper(word, pos + 1, node.nodes[i]))
                    return true;
            }
            return false;
        } else {
            if (node.nodes[ch - 'a'] == null) {
                return false;
            } else {
                return helper(word, pos + 1, node.nodes[ch - 'a']);
            }
        }
    }
    
    public boolean search(String word) {
        if (root == null) return false;
        return helper(word, 0, root);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
//leetcode submit region end(Prohibit modification and deletion)

}