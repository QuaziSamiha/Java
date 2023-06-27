package file;


import java.io.File;

public class File_3
{
    public static void main(String[] args) {
        File object = new File("folder_3");
        object.mkdir(); // folder "folder_3" will be created where the project is remained

        File object_1 = new File("G:/JAVA/Java_Final/folder_3/file_1.txt"); // location copy & paste here and use forward slash
        File object_2 = new File("G://JAVA//Java_Final/folder_3/file_2.txt");

        try {
            object_1.createNewFile();
            object_2.createNewFile();
            System.out.println("Files are created !!!");
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
