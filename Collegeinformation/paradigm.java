package stringtypes;

public class paradigm {
    public static void main(String[]args){
       paradigm obj =new paradigm();
       obj.example();
       String name = "computer";
       String name2 = "Science";
       //Upper case
      //Lower case
      //charAt
      //valueOf
      //contains
      //endsWith
      //equals
      //length
      //add(+)
      //boolean(==)
    }
    public void example(){
        String name = "computer";
        String name1 = "science";
        System.out.println(name.toUpperCase());
        System.out.println(name1.toLowerCase());
        System.out.println(name.charAt(4));
        System.out.println(name.contains("m"));
        System.out.println(name.equals(name1));
        System.out.println(name+name1);
        System.out.println(name.length());
        System.out.println(name.endsWith("r"));
        System.out.println(name==name1);
    }


}
