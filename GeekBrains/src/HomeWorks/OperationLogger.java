package HomeWorks;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class OperationLogger {
    private final Logger logger;

    public OperationLogger(String loggerName, String fileName) {
        logger = Logger.getLogger(loggerName);
        SimpleFormatter formatter = new SimpleFormatter();
        FileHandler fh;
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
