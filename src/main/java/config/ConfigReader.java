package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class ConfigReader {
    static Properties config = new Properties();

    static {

        try {
            FileInputStream configFile = new FileInputStream("target/classes/config.properties");
            config.load(configFile);
            configFile.close();
        } catch (IOException e) {
            //  e.printStackTrace();
            throw new RuntimeException();
        }
    }
    public static String REQUEST_TIMEOUT = config.getProperty("db.request-timeout");
    public static String USERNAME = config.getProperty("db.username");
    public static String ENV = config.getProperty("db.env");
    public static String OS_ENV = System.getProperty("os.name");
    public static String URL = config.getProperty("github_base_url");

/*
    public static void main(String[] args) {



        // Take the variable values from file
        String dbTimeout= config.getProperty("db.request-timeout");
        String dbUsername = config.getProperty("db.username");
        String dbEnv = config.getProperty("db.env");

        System.out.println("Database Timeout: " + dbTimeout);
        System.out.println("Database Username: " + dbUsername);
        System.out.println("Database Environment: " + dbEnv);
    }
*/
}

