package Heaps_and_Hashmap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapChaining<K, V> {
    ArrayList<LinkedList<Entity>> list;

    private class Entity {
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int size = 0;
    private float lf = 0.5f;

    public HashMapChaining() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                entity.value = value;
                return;
            }
        }
        if ((float) size % list.size() > lf) {
            reHash();
            hash = Math.abs(key.hashCode() % list.size());
            entities = list.get(hash);
        }
        entities.add(new Entity(key, value));
        size++;
    }

    private void reHash() {
        System.out.println("Re-Hashing starts");
        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();
        size = 0;
        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }
        for (LinkedList<Entity> entities : old) {
            for (Entity entry : entities) {
                put(entry.key, entry.value);
            }
        }
    }
    public V get(K key){
        int hash = Math.abs(key.hashCode()%list.size());
        LinkedList<Entity> entities = list.get(hash);
        for(Entity entity: entities){
            if(entity.key.equals(key)){
                return entity.value;
            }
        }
        return null;
    }
    public void remove(K key){
        int hash = Math.abs(key.hashCode()%list.size());
        LinkedList<Entity> entities = list.get(hash);
        Entity target = null;
        for(Entity entity: entities){
            if(entity.key.equals(key)){
                target = entity;
                break;
            }
        }
        entities.remove(target);
        size--;
    }
    public boolean containsKey(K key) {
        return get(key) != null;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        boolean first = true;
        for (LinkedList<Entity> entities : list) {
            for (Entity entity : entities) {
                if (!first) builder.append(", ");
                builder.append(entity.key);
                builder.append(" : ");
                builder.append(entity.value);
                first = false;
            }
        }
        builder.append("}");
        return builder.toString();
    }


    public static void main(String[] args) {
        HashMapChaining map = new HashMapChaining();
        map.put("ankur", "98");
        map.put("ansh", "23");
        map.put("rahul", "35");
        map.put("aayush", "98");
        map.put("yug",96);;
        System.out.println(map);

    }
}
