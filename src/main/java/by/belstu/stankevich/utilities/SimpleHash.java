package by.belstu.stankevich.utilities;

import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class SimpleHash {
    public static String makeMd5HashInBase64Format(String someString)  {
        String result="";
        try {
            result=  new String(Base64.getEncoder().encode((java.security.MessageDigest.getInstance("MD5").digest(someString.getBytes()))));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }
}
