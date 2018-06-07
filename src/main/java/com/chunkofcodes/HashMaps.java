package com.chunkofcodes;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    public static void main(String args[]){


    HashMap<Integer, String> hmap = new HashMap<Integer, String>();
    /*Adding elements to HashMap*/
      hmap.put(12, "Chaitanya");
      hmap.put(2, "Rahul");
      hmap.put(7, "Singh");
      hmap.put(49, "Ajeet");
      hmap.put(3, "Anuj");

      // Just the keys
        for (int key : hmap.keySet()) {
            System.out.println("Key="+key);
      }

      // Just the values
        for (Object value : hmap.values()) {
            System.out.println("Value="+value);
        }

       // Both
        for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }

    }

}
