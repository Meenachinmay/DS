 package Searching.TrieClasses;

public class TrieNodes {

    //THIS WILL COUNT THE NUMBER OF TERMINATING STRING AT A PARTICULAR LAST NODE
    public int terminatingCounter;
    public TrieNodes[] trieNodes = new TrieNodes[26];

    //IT WILL RETURN THE NEXT NODE IN THE TRIE
    public TrieNodes next(char c){
        return trieNodes[c-'a'];
    }
}
