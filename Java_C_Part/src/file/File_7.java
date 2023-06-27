package file;  // how to write into a file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class File_7 {
    public static void main(String[] args) {
        File folder_object = new File("folder_7");
        folder_object.mkdir();

        String variable = folder_object.getAbsolutePath();

        File file_object = new File(variable+"/file_1.txt");
        try{
            file_object.createNewFile();
        }catch (Exception e){
            System.out.println(e);
        }

        try{
            Formatter object = new Formatter(variable+"/file_1.txt");
            // Formatter class will open a file which is already created but if the file is not created then Formatter class can create it
            object.format("%s %s\r\n","12","Java Programming");
            object.format("%s %s\r\n","23","C Programming");
            object.format("%s %s\r\n","16","C++ Programming");

            object.close();

        }catch (FileNotFoundException e){
            System.out.println(e);
        }


    }
}
