package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArList {
    public static void main(String[]args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("strawberry");
        list.add("banana");
        list.add("causard apple");
        list.add("pine apple");
        list.add("orange");
        list.size();

      String[]array = list.toArray(new String[list.size()]);
      System.out.println("printing array:" + Arrays.toString(array));
      System.out.println("printing list:" + Arrays.toString(array));
      System.out.println(list.isEmpty());
      System.out.println(list.size());
      System.out.println(list.toArray());
    }
}
