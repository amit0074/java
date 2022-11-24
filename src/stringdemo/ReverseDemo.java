package stringdemo;

public class ReverseDemo {

    public static void main(String[] args) {
        String str=new String("Amit");
        String reverse="";

        for (int i=str.length()-1;i>=0;i--){
            reverse=reverse.concat(String.valueOf(str.charAt(i)));

        }

        System.out.println(reverse);

        StringBuffer stringBuffer=new StringBuffer(str);
        System.out.println(stringBuffer.reverse());



    }
}
