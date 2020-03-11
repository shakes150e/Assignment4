package org.example;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class hashTopic {

    public static void main(String[] args) {
        HashMap<Integer, String> m=new HashMap<Integer,String>();

        m.put(1, "one");
        m.put(2, "two");
        m.put(3, "three");

        System.out.println(m);

        TreeMap<String, String> tm =new TreeMap<String, String>();

        tm.put("R", "red");
        tm.put("G", "green");
        System.out.println(tm);

        Hashtable<Integer, String> ht =new Hashtable<Integer, String>();

        ht.put(1, "one");
        ht.put(2, "two");
        System.out.println(ht);

    }
}
