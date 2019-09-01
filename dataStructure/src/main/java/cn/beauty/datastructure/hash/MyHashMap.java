package cn.beauty.datastructure.hash;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class MyHashMap<K, V> extends AbstractMap<K, V> implements Map<K, V>, Cloneable, Serializable {
    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;
    static final float DEFAULT_LOAD_FACTOR = 0.75f;
    static final int MAXIMUM_CAPACITY = 1 << 30;

    final float mLoadFactor;
    int mThreshold;

    transient Node<K,V>[] mTable;
    transient int mModCount;
    transient int mSize;

    public MyHashMap(int initialCapacity) {
        this(initialCapacity, DEFAULT_LOAD_FACTOR);
    }

    public MyHashMap(int capacity, float loadFactor) {
        this.mLoadFactor = loadFactor;
        this.mThreshold = tableSizeFor(capacity);
    }

    //todo can not understand the implementation;
    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return n;
    }

    @Override
    public V put(K k, V v) {
        return putVal(hash(k), k, v, false);
    };

    // todo implement putVal;
    final V putVal(int hash, K key, V value, boolean onlyIfAbsent) {
        Node<K,V>[] table;
        Node<K,V> targetNode;
        int tableSize;
        int nodeIndex;

        if ((table = mTable) == null || (tableSize = table.length) == 0) {
            tableSize = (table = resize()).length;
        }

        if ((targetNode = table[nodeIndex = (tableSize - 1) & hash]) == null) {
            table[nodeIndex] = new Node(hash, key, value, null);
        } else {
            Node<K,V> existNode;
            K k;
            if (hash == targetNode.mHash &&
                    ((k = targetNode.mKey) == key || (k != null && k.equals(targetNode.mKey)))) {
                existNode = targetNode;
            } else {
                for (int binCount = 0; ; ++binCount) {
                    if ((existNode = targetNode.mNext) == null) {
                        targetNode.mNext = new Node(hash, key, value, null);
                        break;
                    }

                    if (existNode.mHash == hash &&
                            ((k = targetNode.mKey) == key || (key != null && key.equals(k)))) {
                        break;
                    }
                    targetNode = existNode;
                }
            }

            if (existNode != null) {
                V oldValue = existNode.mValue;
                if (!onlyIfAbsent || oldValue == null) {
                    existNode.mValue = value;
                    return oldValue;
                }
            }
        }
        mModCount++;
        if (++mSize > mThreshold) {
            resize();
        }
        return null;
    }


    @Override
    public Set<Entry<K,V>> entrySet() {
        return null;
    }

    static final int hash(Object key) {
        int h;
        return key == null? 0 : ((h = key.hashCode()) ^ (h >>> 16));
    }

    final Node<K,V>[] resize() {
        Node<K,V>[] oldTable = mTable;
        int oldCap = oldTable == null? 0 : oldTable.length;
        int oldThr = mThreshold;
        int newCap = 0, newThr = 0;

        if (oldCap > 0) {
            if ((newCap = oldCap << 1) < MAXIMUM_CAPACITY && oldCap >= DEFAULT_INITIAL_CAPACITY) {
                newThr = oldThr << 1;
            }
        } else if (oldThr > 0) {

        } else {
            newCap = DEFAULT_INITIAL_CAPACITY;
            newThr = (int)(DEFAULT_INITIAL_CAPACITY * DEFAULT_LOAD_FACTOR);
        }
        mThreshold = newThr;
        Node<K,V>[] newTab = (Node<K,V>[])new Node[newCap];
        mTable = newTab;

        if (oldTable != null) {


        }



        return newTab;
    }


    static class Node<K, V> implements Map.Entry<K, V> {
        final int mHash;
        final K mKey;
        V mValue;
        Node<K, V> mNext;

        public Node(int hash, K key, V value, Node<K, V> next) {
            this.mHash = hash;
            this.mKey = key;
            this.mValue = value;
            this.mNext = next;
        }

        @Override
        public K getKey() {
            return mKey;
        }

        @Override
        public V getValue() {
            return mValue;
        }

        @Override
        public V setValue(V v) {
            V oldValue = mValue;
            mValue = v;
            return oldValue;
        }


        @Override
        public String toString() {
            return mKey + "=" + mValue;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o instanceof Map.Entry) {
                //todo why use ? type
                Map.Entry<?, ?> entry = (Map.Entry<?, ?>)o;
                if (Objects.equals(mKey, entry.getKey()) &&
                Objects.equals(mValue, entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(mKey) ^ Objects.hashCode(mValue);
        }
    }





}
