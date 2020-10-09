package cn.base.base06;

import cn.base.base06.huiwen.HuiwenString;
import cn.base.base06.lru.LRUCache;
import cn.base.base06.lru.LRUCacheByArray;
import cn.base.base06.lru.LRUCacheByLinkedHashMap;

public class SolutionTest {
    public static void main(String[] args) {
        LRUCache<Integer> lru = new LRUCache<Integer>(6);
        lru.insert(6);
        lru.insert(5);
        lru.insert(4);
        lru.insert(1);
        lru.insert(2);
        lru.insert(3);
        lru.show();
        lru.get(99);
        lru.insert(10);
        lru.show();
        lru.get(3);
        lru.get(1);
        lru.show();
        System.out.println("------------------");
        LRUCacheByLinkedHashMap<Integer, Integer> lru2 = new LRUCacheByLinkedHashMap<Integer, Integer>(6);
        lru2.get(6);
        lru2.get(2);
        lru2.get(1);
        lru2.get(3);
        lru2.get(5);
        lru2.get(9);
        lru2.show();
        lru2.get(6);
        lru2.get(5);
        lru2.show();
        lru2.get(11);
        lru2.get(45);
        lru2.show();
        System.out.println("---------------------");
        LRUCacheByArray lru3 = new LRUCacheByArray(6);
        lru3.get(6);
        lru3.get(2);
        lru3.get(1);
        lru3.get(3);
        lru3.get(5);
        lru3.get(9);
        lru3.show();
        lru3.get(8);
        lru3.get(7);
        lru3.show();
        lru3.get(5);
        lru3.get(1);
        lru3.show();

        HuiwenString.Node node1 = new HuiwenString.Node('a');
        HuiwenString.Node node2 = new HuiwenString.Node('b');
        HuiwenString.Node node3 = new HuiwenString.Node('c');
        HuiwenString.Node node33 = new HuiwenString.Node('c');
        HuiwenString.Node node4 = new HuiwenString.Node('a');
        HuiwenString.Node node5 = new HuiwenString.Node('a');
        
        
        node1.next = node2;
        node2.next = node3;
        node3.next = node33;
        node33.next = node4;
        node4.next = node5;
        boolean huiwen = new HuiwenString().isHuiwen(node4);
        System.out.println(huiwen);
    }
}
