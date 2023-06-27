package basic_knowledge;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_2 {

    public static void main(String[] args) {

        LocalTime object_1 = LocalTime.now();

        DateTimeFormatter object_2 = DateTimeFormatter.ofPattern("hh:mm:ss");

        String object_3 = object_1.format(object_2);
        System.out.println(object_3);
    }
}
