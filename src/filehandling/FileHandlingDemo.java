package filehandling;

import java.io.*;
import java.net.URI;


public class FileHandlingDemo {
    public static void main(String[] args) {

        File file=new File("text.txt");
        try{
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            String str="Amit";
            byte arr[]=str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("File write successfully");
        } catch (IOException e) {

            System.out.println(e);

        }
        try{
            FileInputStream fileInputStream=new FileInputStream(file);

            int i=fileInputStream.read();
            while(i>=0){
                System.out.println((char)i);
                i=fileInputStream.read();

            }

        }catch(IOException e){
            throw new RuntimeException(e);
        }


    }


}
