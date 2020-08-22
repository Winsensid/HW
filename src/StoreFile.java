import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class StoreFile {

    public static void main(String[] args)  throws  Exception{

        //Store Emails
        Properties p = new Properties();

        //object of OutputStream to store data into the file
        OutputStream os = new FileOutputStream("File.properties");

        //set the properties
        p.setProperty("Email1", "Winsen@izaan.com");
        p.setProperty("Email2", "Jahidul@izaan.com");
        p.setProperty("Email3", "Bintia@izaan.com");
        p.setProperty("Email4", "sadaf@izaan.com");
        p.setProperty("Email5", "fatema@izaan.com");
        p.setProperty("Email6", "Abby@izaan.com");
        p.setProperty("Email7", "adnan@izaan.com");
        p.setProperty("Email8", "Ismayati@izaan.com");
        p.setProperty("Email1", "Winsen@izaan.com");
        p.setProperty("Email2", "Jahidul@izaan.com");



        //Store
        p.store(os, "File");

        //Read.
        p.list(System.out);








    }


}
