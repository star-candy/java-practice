package Day20241204;

interface Pair<K, V> {
    K getKey(); //k 타입 getKey 추상 메서드
    V getValue();
}

class KeyValue<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public KeyValue(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
public class gen4_Interface {
    public static void main(String[] args) {
        //Pair<String, Integer> pair = new KeyValue<>("홍길동", 35);
        KeyValue<String, Integer> pair = new KeyValue<>("홍길동", 35);

        String name = pair.getKey();
        int age = pair.getValue();

        System.out.println("이름: " + name + ", 나이: " + age);
    }
}
