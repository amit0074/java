package stringdemo;

public class StringDemo {
    public static void main(String[] args) {
        String str="Pune";
        String str2="Satara";

        String str1=new String("Mumbai");

        String s=str.concat(str2);
        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(s.lastIndexOf("p"));
        System.out.println(s.indexOf("p"));
        System.out.println(s.indexOf("p",3));
        System.out.println(s.substring(5,8));

        String str4=new String("Satara");

        System.out.println(str4==str2);
        System.out.println(str2.equals(str4));



    }
}
