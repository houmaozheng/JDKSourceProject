package com.hmz.source.java.util.hashMap;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    @Test
    public void testHashMapPut(){
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("key1", "value1");
        hashMap.put("key2", "value1");
        System.out.println("1.8 的 testHashMapPut");
    }
}
