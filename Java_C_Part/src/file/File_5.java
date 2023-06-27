package file;

import java.io.File;

public class File_5 {
    public static void main(String[] args) {
        File object = new File("folder_5");
        object.mkdir(); // created folder use mkdir() method

        String variable = object.getAbsolutePath(); // getting folder location

        File object_1 = new File(variable+"/file_1.txt");

        try {
            object_1.createNewFile(); // createNewFile() is used for creating a file
            System.out.println("A new file file_1 is created in " +variable); // printing a message for conformation & file's location
        }catch (Exception e) {
            System.out.println(e); // it will show a message if any exception occurs
        }

        if(object_1.exists()) // exists() is method for knowing file existence
        {
            System.out.println("\nfile_1 exists !"); // printing a message for conformation of existence
        }
    }
}
