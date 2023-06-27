package file;   // how to write a file (taking input from user)

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class File_8 {
    public static void main(String[] args) {
        File folder_object = new File("folder_8"); // creating a folder
        folder_object.mkdir();

        String variable = folder_object.getAbsolutePath(); // getting location of folder

        File file_object = new File(variable+"/file_1.txt"); // creating a file
        try {
            file_object.createNewFile();
        }catch (Exception e){
            System.out.println(e);
        }

        String v1, v2; // variable for storing input data

        try{
            Formatter object = new Formatter(variable+"/file_1.txt"); // opening a file

            Scanner input_object = new Scanner(System.in); // taking input from user
            System.out.print("How many data : ");
            int variable_1 = input_object.nextInt();

            for(int i = 0; i < variable_1; i++)
            {
                System.out.print("Enter a integer and a string : "); // taking input from user
                v1 = input_object.next();
                v2 = input_object.next();

                object.format("%s %s\r\n", v1, v2); // writing in file
            }

            object.close();

        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
