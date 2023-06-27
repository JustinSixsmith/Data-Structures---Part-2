package start.part2;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        var trie = new Trie();
        trie.insert("car");
        trie.insert("care");
        trie.remove("book");
        System.out.println(trie.contains("car"));
        System.out.println(trie.contains("care"));
    }
}
