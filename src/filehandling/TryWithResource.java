package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//public class TryWithResource {
//
//    public static void main(String[] args) {
//
//        try{
//            fileWriter=new FileWriter("C:\\Users\\amitt\\IdeaProjects\\CodekulJava\\src\\filehandling\\sample.txt");
//            fileWriter.write("India IS my Country");
//            System.out.println("file write successfully");
//        }catch(IOException e){
//            throw new RuntimeException(e);
//        }
//
//        try(FileReader fileReader= new FileReader("C:\\Users\\amitt\\IdeaProjects\\CodekulJava\\src\\filehandling\\sample.txt")){
//            for(int i=fileReader.read();i>=0;){
//                System.out.println((char)i);
//                i=fileReader.read();
//            }
//        }
//    }
//}
