package collection;

import java.util.HashSet;

public class Hset {
    public static void main(String[]args){
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(9);
        hashSet.add(0);
        hashSet.add(8);
        System.out.println(hashSet);
    }
}
