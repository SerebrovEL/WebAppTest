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

    public void put(String word) {
        if (word == null) {
            return;
        }
        word = trimLowercaseString(word);
        String key = "";
        for (int i = 0; i < word.length(); i++) {
            key += word.charAt(i);
            if (!root.containsKey(key)) {
                Set<String> set = new HashSet<>();
                set.add(word);
                root.put(key, set);
            } else {
                root.get(key).add(word);
            }
        }
    }

    public void remove(String word) {
        if (word == null) {
            return;
        }
        word = trimLowercaseString(word);
        String key = "";
        for (int i = 0; i < word.length(); i++) {
            key += word.charAt(i);
            if (root.containsKey(key)) {
                if (root.get(key).size() > 1) {
                    root.get(key).remove(word);
                } else {
                    root.get(key).remove(word);
                    root.remove(key);
                }
            }
        }
    }

    public List<String> get(String key) {
        if (key == null) {
            return null;
        }
        key = trimLowercaseString(key);

        List<String> result = new ArrayList<>();
        root.get(key).forEach(element -> {
            if (result.size() < 4) {
                result.add(element);
            }
        });
        return result;
    }

    public boolean contains(String word) {
        if (word == null) {
            return false;
        }
        word = trimLowercaseString(word);
        String key = "";
        for (int i = 0; i < word.length(); i++) {
            key += word.charAt(i);
            if (!root.containsKey(key)) {
                return false;
            }
        }
        return true;
    }

    protected String trimLowercaseString(String word) {
        return word.toLowerCase().trim();
    }
}
