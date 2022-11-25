package stringdemo;

public class StringNumberDemo {
    public static void main(String[] args) {

        String str="Amit";

        int cnt=1;
        char[] arr=str.toCharArray();

        for (int i=1;i<=str.length();i++){
            cnt++;
            System.out.println(str+":"+i);
        }
    }
}
