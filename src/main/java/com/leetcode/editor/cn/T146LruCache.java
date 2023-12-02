package com.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @author  lidongmeng
 * @date 2023-11-08 20:54:40
 * @link https://leetcode.com/problems/lru-cache/
 */
public class T146LruCache {

	//leetcode submit region begin(Prohibit modification and deletion)
class LRUCache {
    Map<Integer, Node> mmap;
    Node head;
    Node tail;
    int capacity;
    int size;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        size = 0;
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.pre = head;
        mmap = new HashMap<>();
    }
    
    public int get(int key) {
        if (!mmap.containsKey(key)) return -1;
        Node node = mmap.get(key);
        moveToHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if (mmap.containsKey(key)) {
            Node node = mmap.get(key);
            node.value = value;
            moveToHead(node);
            return;
        }
        size++;
        if (size > capacity) {
            Node node = tail.pre;
            deleteNode(node);
            mmap.remove(node.key);
            size--;
        }

        Node node = new Node(key, value);
        addToHead(node);
        mmap.put(key, node);
    }

    void addToHead(Node node) {
        node.next = head.next;
        head.next.pre = node;
        node.pre = head;
        head.next = node;
    }

    void moveToHead(Node node) {
       deleteNode(node);
       addToHead(node);
    }

    void deleteNode(Node node) {
        Node pre = node.pre;
        pre.next = node.next;
        node.next.pre = pre;
    }

    class Node {
        int key;
        int value;
        Node next;
        Node pre;
        Node(int _key, int _value) {
            this.key = _key;
            this.value = _value;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
//leetcode submit region end(Prohibit modification and deletion)

}