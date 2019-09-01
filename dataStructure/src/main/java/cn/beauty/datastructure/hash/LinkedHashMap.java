package cn.beauty.datastructure.hash;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap<K, V> extends HashMap<K, V> {

    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return false;
    }






}
