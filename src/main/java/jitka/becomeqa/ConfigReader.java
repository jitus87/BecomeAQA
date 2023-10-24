package jitka.becomeqa;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfigReader {

    public static void main(String[] args) {


        // Load configuration file
        Properties config = new Properties();
        try {
            FileInputStream configFile = new FileInputStream("target/classes/config.properties");
            config.load(configFile);
            configFile.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Take the variable values from file
        String dbTimeout= config.getProperty("db.request-timeout");
        String dbUsername = config.getProperty("db.username");
        String dbEnv = config.getProperty("db.env");

        System.out.println("Database Timeout: " + dbTimeout);
        System.out.println("Database Username: " + dbUsername);
        System.out.println("Database Environment: " + dbEnv);


    }

}
