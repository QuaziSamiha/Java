package file;

import java.io.File;

public class File_6 {
    public static void main(String[] args) {
        File folder_object = new File("folder_6");
        folder_object.mkdir(); // created folder use mkdir() method

        String variable = folder_object.getAbsolutePath(); // getting folder location

        File file_object = new File(variable+"/file_1.txt");

        try{
            file_object.createNewFile(); // createNewFile() is used for creating a file
            System.out.println("A new file file_1 is created in " +variable); // printing a message for conformation & file's location
        }catch (Exception e) {
            System.out.println(e); // it will show a message if any exception occurs
        }

        file_object.delete(); // a method for deleting a file

        if(file_object.exists()) // exists() is method for knowing file existence
        {
            System.out.println("\nA new file exists !!"); // printing a message for conformation of existence
        }
        else {
            // this block executes if delete() method is used and the created file is already deleted
            System.out.println("\nFile does not exist !!"); // printing a message for conformation of not existence
        }
    }
}
