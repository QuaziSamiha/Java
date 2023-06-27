package file;  // how to read from a file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class File_9 {
    public static void main(String[] args) {
        File folder_object = new File("folder_9");
        folder_object.mkdir();

        String variable = folder_object.getAbsolutePath();

        File file_object = new File(variable+"/file_1.txt");
        try {
            file_object.createNewFile();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
