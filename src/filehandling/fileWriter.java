package filehandling;

import java.io.File;
import java.io.FileWriter;

public class fileWriter {

    public static void main(String[] args) {

        File file=new File("sample1.txt");


        try{
            FileWriter f=new FileWriter(file);
            String str="Amit";
            f.write(str+" Talegaonkar");
            System.out.println("File Write Successfully");
            f.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
