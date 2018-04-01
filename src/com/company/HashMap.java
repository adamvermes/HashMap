package com.company;

import java.util.LinkedList;

public class HashMap<K, V> {

    private int bucketSize = 20;

    private LinkedList<KeyValue>[] elements = new LinkedList[bucketSize];

    public void addElements(K key, V value) {
        if(key == null) {
            
        }

        int hash = getHash(key);
        KeyValue<K, V> keyValue = new KeyValue(key, value);
        if (elements[getPosition(hash)] == null) {
            elements[getPosition(hash)] = new LinkedList<KeyValue>();
        }
        elements[getPosition(hash)].add(keyValue);
    }

    public V getValue(K key) {
        int position = getPosition(getHash(key));
        return (V)elements[position].stream().filter(e -> e.getKey() == key).findAny().get().getValue();
        // noSuchElementException handling
    }

    public int getPosition(int hash) {
        return hash % (bucketSize + 1);
    }

    public int getHash(K key) {
        return key.hashCode();
    }

}
