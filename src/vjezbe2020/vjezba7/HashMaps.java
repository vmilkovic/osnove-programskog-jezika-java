package vjezbe2020.vjezba7;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    private Map<Integer, String> hashMap;

    public HashMaps(){
        hashMap = new HashMap<>() {{
            put(0, "HashMapItem1");
            put(1, "HashMapItem2");
            put(2, "HashMapItem3");
            put(3, "HashMapItem4");
            put(4, "HashMapItem5");
        }};
    }

    public void showHashMapEntry(){
        System.out.println(hashMap.entrySet());
    }

    public void hasKey(int key){
        if( hashMap.containsKey(key) ) System.out.println("HashMap contains key: " + key);
    }

    public String getValue(int key){
        if( hashMap.containsKey(key) )
            return hashMap.get(key);
        return null;
    }

    public void showValues(){
        for (String value : hashMap.values()) {
            System.out.println(value);
        }
    }

}
