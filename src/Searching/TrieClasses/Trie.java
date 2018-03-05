package Searching.TrieClasses;

public class Trie {

    //CREATING ROOT NODE
    TrieNodes root;

    public Trie (){
        this.root = new TrieNodes();
    }

    //QUERY METHOD (TO CHECK A STRING DOES EXIST IN THE TRIE OR NOT)
    public int Query(String string){
        TrieNodes current = root;

        for (int i = 0; i < string.length(); i ++){

            if (current == null){
                return 0;
            }
            current = current.next(string.charAt(i));
        }

        return current.terminatingCounter;
    }

    //INSERTION METHOD (this will insert a new string into Trie)
    public void Insert(String string){
        TrieNodes current = root;
        for (int i = 0; i < string.length(); i ++){
            if (current.trieNodes[string.charAt(i) - 'a'] == null){
                current.trieNodes[string.charAt(i) - 'a'] = new TrieNodes();
            }
            current = current.next(string.charAt(i));
        }
        current.terminatingCounter++;
    }

    //DELETING METHOD (this will delete the a particular string)
    public void Delete(String string){
        TrieNodes current = root;
        for (int i = 0; i < string.length(); i ++){
            if (current == null){
                throw new RuntimeException("String is not exist!!");
            }
            current = current.next(string.charAt(i));
        }
        current.terminatingCounter--;
    }

    //UPDATING THE METHOD (this will method update a new string)
    public void Update (String oldstring, String newstring){
        //DELETING THE OLD STRING FIRST
        Delete(oldstring);
        //INSERTING THE NEW STRING
        Insert(newstring);
    }
}
