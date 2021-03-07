package utils;


import config.MyFormatter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class LoggerUtil {
    private static Logger logger;
    private static FileHandler fileHandler;

    static {
        logger = Logger.getGlobal();
        try {
            fileHandler = new FileHandler("report.log");
        } catch (IOException e) {
            e.printStackTrace();
        }
        fileHandler.setFormatter(new MyFormatter());
        logger.addHandler(fileHandler);
    }

    public static void addInfoLog(String text) {
        logger.info(text);
    }
}
