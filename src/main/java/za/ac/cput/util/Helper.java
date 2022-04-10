package za.ac.cput.util;

import java.util.UUID;

public class Helper {
    public static String generatedId(){
        return UUID.randomUUID().toString();
    }
}
