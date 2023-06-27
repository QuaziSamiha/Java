package file;  // hoe w to read from a file

import java.io.File;
import java.util.Scanner;

public class File_10
{
    public static void main(String[] args)
    {
        try {
            File file_object = new File("G:/JAVA/Java_Final/folder_9/file_1.txt"); // here we copy & paste file location

            Scanner read_object = new Scanner(file_object);
            while (read_object.hasNext()) // hasNext() method will read data till data remains
            {
                String variable_1 = read_object.next(); // reading from file
                String variable_2 = read_object.next(); // reading from file

                System.out.println("Integer : " +variable_1 +" String : " +variable_2);
            }
            read_object.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
