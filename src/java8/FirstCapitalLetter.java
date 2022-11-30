package java8;

public class FirstCapitalLetter {
    public static void main(String[] args) {
        MyInterface6 m=FirstCapitalLetter::firstlettercaps;
        System.out.println(m.Capital("amit"));






    }
    private static String firstlettercaps(String str){
        return str.replaceFirst(str.substring(0,1),new String(String.valueOf(str.charAt(0))).toUpperCase());

    }
}

interface MyInterface6{
    String Capital(String str);
}