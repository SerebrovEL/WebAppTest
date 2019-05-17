package tier;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapNode<V> extends AbstractMapNode<V> {

    public HashMapNode(char character) {
        super(character);
    }

    @Override
    protected Map<Character, TrieNode<V>> onCreateMap() {
        return new LinkedHashMap<>();
    }

    @Override
    protected AbstractMapNode<V> onCreateNewNode(char character) {
        return new HashMapNode<>(character);
    }
}
