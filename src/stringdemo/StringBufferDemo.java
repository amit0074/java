package stringdemo;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("Pune");
        StringBuffer stringBuffer1=new StringBuffer("Pune");

        stringBuffer.append(stringBuffer1);
        System.out.println(stringBuffer);

    }
}
