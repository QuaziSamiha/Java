package file;  // creating a directory or folder

import java.io.File; // importing File class

public class File_1
{
    public static void main(String[] args)
    {
        File object = new File("file_folder_1"); // this folder will be created where the project remained

        // directory will be created
        object.mkdir(); // mkdir() is a method for creating a directory or folder

        /*
        // if we wish to create a folder anywhere else from project
        File object_1 = new File("G:/JAVA/file_folder_2"); // at first copy the location and paste here and then select any name for folder
        object_1.mkdir();
        */
    }
}
