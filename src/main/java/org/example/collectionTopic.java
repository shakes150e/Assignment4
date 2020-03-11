package org.example;

import java.util.*;
public class collectionTopic{
    public static void main(String args[]){
        LinkedList<String> al=new LinkedList<String>();
        al.add("Sanele");
        al.add("Sipho");
        al.add("Dan");
        al.add("Class");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
