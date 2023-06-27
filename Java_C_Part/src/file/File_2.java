package file;  // creating a folder and printing its location using method

import java.io.File;

public class File_2
{
    public static void main(String[] args)
    {
        File object = new File("folder_1"); // creating object for File class and naming the folder we want to create

        object.mkdir(); // folder will be created

        String variable;
        variable = object.getAbsolutePath(); // getAbsolutePath() method will return "folder_1" location
        System.out.println(variable);

        System.out.println(object.getName()); // getName() method will show created folder name

        if(object.delete())
        {
            System.out.println(object.getName()+" has been deleted !!!"); // delete() method will delete the folder
        }
    }
}
