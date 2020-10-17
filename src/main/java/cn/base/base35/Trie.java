package cn.base.base35;

/**
 * Trie树的实现
 */
public class Trie {
    class TrieNode {
        char data;
        TrieNode children[];
        boolean isEndingChar = false;

        public TrieNode(char ch) {
            this.data = ch;
            children = new TrieNode[26];
        }
    }
    private TrieNode root;

    public Trie() {
       root = new TrieNode('/');
    }

    public Trie(String[] strings) {
        this();
        for (String s : strings) {
            insert(s);
        }
    }

    private void insert(String s) {
        char[] text = s.toCharArray();
        TrieNode p = root;
        for (int i = 0; i < text.length; i++) {
            int index = text[i] - 'a';
            if (p.children[i] == null) {
                p.children[i] = new TrieNode(text[i]);
            }
            p = p.children[i];
        }
        p.isEndingChar = true;
    }

    public boolean contains(String s) {
        char[] text = s.toCharArray();
        TrieNode p = root;
        for (int i = 0; i < text.length; i++) {
            int index = text[i] - 'a';
            if (p.children[index] == null) {
                return false;
            }
            p = p.children[i];
        }
        if (p.isEndingChar == false) return false; // 仅仅是一个前缀
        return true;
    }
}
