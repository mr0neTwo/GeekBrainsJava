package HomeWorks;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class OperationLogger {
    Logger logger;
    FileHandler fh;
    SimpleFormatter formatter;

    public OperationLogger(String loggerName, String fileName) {
        logger = Logger.getLogger(loggerName);
        formatter = new SimpleFormatter();
        try {
            fh = new FileHandler(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        fh.setFormatter(formatter);
        logger.addHandler(fh);
    }

    public void addInfoLog(String log) {
        logger.info(log);
    }
}
