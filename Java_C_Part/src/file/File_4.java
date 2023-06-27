package file;

import java.io.File;

public class File_4
{
    public static void main(String[] args) {
        File object = new File("folder_4");
        object.mkdir();

        String variable = object.getAbsolutePath(); // to get location of the folder "folder_4"

        File object_1 = new File(variable+"/file_1.txt");

        try{
            object_1.createNewFile();
            System.out.println("File is created in " +variable);
        }catch (Exception e) {
            System.out.println(e);
        }

    }
}
