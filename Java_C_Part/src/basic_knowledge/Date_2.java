package basic_knowledge;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_2 {

    public static void main(String[] args) {

        Date object_1 = new Date();
        String object_3;

        DateFormat object_2 = new SimpleDateFormat("dd/MM/YYYY");
        object_3 = object_2.format(object_1);
        System.out.println(object_3);

        DateFormat object_4 = new SimpleDateFormat("MM/dd/YYYY");
        object_3 = object_4.format(object_1);
        System.out.println(object_3);
    }
}
