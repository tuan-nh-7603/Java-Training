package Generic;

// class generic with key-value
public class ClassGeneric<K, V> {
    private K key;
    private V value;

    public ClassGeneric(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }


    public static void main(String[] args) {
        ClassGeneric<String, Integer> entry = new ClassGeneric<String, Integer>("Thanh", 123456789);
        String name = entry.getKey();
        Integer id = entry.getValue();
        System.out.println("Name = " + name + ", Id = " + id);
    }
}
