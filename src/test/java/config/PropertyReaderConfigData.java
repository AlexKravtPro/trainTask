package config;

import constants.ConstantsConfigData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReaderConfigData {
    private static Properties properties = new Properties();
    private static String value;
    private static FileInputStream fileInputStream;

    public static String getProperty(String str) {
        try {
            fileInputStream = new FileInputStream(ConstantsConfigData.FILE_CONFIG_DATA);
            properties.load(fileInputStream);
            value = properties.getProperty(str);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }
}
