package techproed.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    //This class reads the configuration.properties file (the only purpose is this)
    //Create Properties instance
    private static Properties properties;
    static {
        //path of the configuration file
        String path="configuration.properties";
        try {
            //Opening configuration.properties file using FileInputStream
            FileInputStream fileInputStream = new FileInputStream(path); //(bu filelari okumak icn javadan gelen metod)
            properties = new Properties();  //opening file
            properties.load(fileInputStream);  //loading file
            //close the file
            fileInputStream.close();   //closing file
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //This method will get the key from properties file,
    //And return the value as String
    //We create this method to read the file
    public static String getProperty(String key){
        String value=properties.getProperty(key);
        return value;
    }
    //TEST IF LOGIC WORKS
    public static void main(String[] args) {
        System.out.println(properties.getProperty("techproed_url"));
        System.out.println(properties.getProperty("google_url"));
        System.out.println(properties.getProperty("browser"));
    }
}