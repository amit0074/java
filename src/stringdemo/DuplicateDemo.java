package stringdemo;

public class DuplicateDemo {
    public static void main(String[] args) {

        String s1 = "sataraismycity";
        int count = 0;
        char[] arr = s1.toCharArray();
        System.out.println("Duplicate Values are:");

        for (int i = 0; i < s1.length(); i++) {

            for (int j = i+1; j < s1.length(); j++) {
                if (arr[i] == arr[j] && arr[i]!= ' ') {
//                    System.out.print(arr[j]+" ");
                    count++;
                    arr[j]='0';

                }
            }
            if (count>1 && arr[i]!='0'){
                System.out.print(arr[i]+" ");
            }

        }
    }
}











