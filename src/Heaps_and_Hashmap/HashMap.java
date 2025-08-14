package Heaps_and_Hashmap;

import java.util.Arrays;
import java.util.LinkedList;

public class HashMap {
    private final Entity[] entities;

    public HashMap() {
        entities = new Entity[100];
    }

    private static class Entity {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value);
    }

    public String get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash] = null;
        }
    }


    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("ankur", "98");
        map.put("ansh", "23");
        map.put("rahul", "35");
        System.out.println(map.get("ansh"));
        System.out.println(map.get("yau"));
    }
}
