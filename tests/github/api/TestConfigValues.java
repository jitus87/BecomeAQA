package github.api;

import config.ConfigReader;

public class TestConfigValues {


    public static void main(String[] args) {

        System.out.println("timeout is: "+ConfigReader.REQUEST_TIMEOUT);
        System.out.println("User name is: "+ConfigReader.USERNAME);
        System.out.println("Environment selected is: "+ConfigReader.ENV);
        System.out.println("Github URL: "+ConfigReader.URL);
//property from system
        System.out.println("OS system name is: "+ConfigReader.OS_ENV);

    }
}

