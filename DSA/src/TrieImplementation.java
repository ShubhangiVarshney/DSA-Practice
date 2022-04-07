import java.util.HashMap;

public class TrieImplementation {
    HashMap<Character, HashMap> root;

    public void Trie() {
        root = new HashMap<Character, HashMap>();
    }

    public void addWord(String word) {
        HashMap<Character, HashMap> node = root;
        for (int i = 0; i < word.length(); i++) {
            Character currentLetter = word.charAt(i);
            if (node.containsKey(currentLetter) == false) {
                node.put(currentLetter, new HashMap<Character, HashMap>());
            }
            node = node.get(currentLetter);
        }
    }

    public boolean containsPrefix(String word) {
        HashMap<Character, HashMap> node = root;
        for (int i = 0; i < word.length(); i++) {
            Character currentLetter = word.charAt(i);
            if (node.containsKey(currentLetter)) {
                node = node.get(currentLetter);
            } else {
                return false;
            }
        }
        return true;
    }
}
