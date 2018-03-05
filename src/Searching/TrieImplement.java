package Searching;

import java.util.ArrayList;
import java.util.List;

public class TrieImplement {
    public List<String> data = new ArrayList<String>();

    public TrieImplement(){ addStrings(); }

    private void addStrings(){
        data.add("pqrs");
        data.add("pprt");
        data.add("psst");
        data.add("qqrs");
        data.add("pqrs");
    }
}

