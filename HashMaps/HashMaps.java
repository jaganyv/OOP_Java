package HashMaps;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String , Integer> hashMap = new HashMap<>();
        hashMap.put("Apple",250);
        hashMap.put("Orange",260);
        hashMap.put("Pineapple",100);
        hashMap.put("Banana",50);

//        hashMap.remove("Apple");
//        hashMap.get("Orange");
//        System.out.println(hashMap.containsKey("Apple"));
//        System.out.println(hashMap.containsValue(100));
//        System.out.println(hashMap.size());
        for(String key: hashMap.keySet()){
            System.out.println(key + " : $" + hashMap.get(key));
        }
    }
}
