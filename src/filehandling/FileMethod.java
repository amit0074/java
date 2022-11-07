package filehandling;

import java.io.File;
import java.io.IOException;

public class FileMethod {

    public static void main(String[] args) {
        try{
            File file=new File("sample1.txt");
            if(file.exists()){
                System.out.println("File Already Exist");
            }else {
                file.createNewFile();
                System.out.println("File Successfully Created");
            }
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.getCanonicalFile());
            System.out.println(file.getPath());

            System.out.println(file.isHidden());
            System.out.println(file.getTotalSpace());
            System.out.println(file.length());
            System.out.println(file.getFreeSpace());

            File file1 =new File("Test");
            file1.mkdir();

            File file2=new File("Test\\abc.txt");
            file2.mkdir();
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
