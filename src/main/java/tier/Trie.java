package tier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author serebrov e.l.
 */
public class Trie {

    private final Map<String, Set<String>> root;

    public Trie() {
        this.root = new HashMap<>();
    }

    public void put(String Word) {
        if (Word == null) {
            return;
        }
        Word = trimLowercaseString(Word);
        String c = "";
        for (int i = 0; i < Word.length(); i++) {
            c += Word.charAt(i);
            if (!root.containsKey(c)) {
                Set<String> set = new HashSet<>();
                set.add(Word);
                root.put(c, set);
            } else {
                root.get(c).add(Word);
            }
        }
    }

    public void remove(String Word) {
        if (Word == null) {
            return;
        }
        Word = trimLowercaseString(Word);
        String c = "";
        for (int i = 0; i < Word.length(); i++) {
            c += Word.charAt(i);
            if (root.containsKey(c)) {
                if (root.get(c).size() > 1) {
                    root.get(c).remove(Word);
                } else {
                    root.get(c).remove(Word);
                    root.remove(c);
                }
            }
        }
    }

    public boolean contains(String Key) {
        if (Key == null) {
            return false;
        }
        Key = trimLowercaseString(Key);
        String c = "";
        for (int i = 0; i < Key.length(); i++) {
            c += Key.charAt(i);
            if (!root.containsKey(c)) {
                return false;
            }
        }
        return true;
    }

    public List<String> get(String Key) {
        if (Key == null) {
            return null;
        }
        Key = trimLowercaseString(Key);

        List<String> result = new ArrayList<>();
        root.get(Key).forEach(element -> {
            if (result.size() < 4) {
                result.add(element);
            }
        });
        return result;
    }

    protected String trimLowercaseString(String key) {
        return key.toLowerCase().trim();
    }
}
