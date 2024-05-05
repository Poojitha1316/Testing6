import java.util.ArrayList;
import java.util.List;
public class Logger {
    private static Logger instance;
    private List<String> logMessages;

    private Logger() {
        logMessages = new ArrayList<>();
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void info(String message) {
        log("INFO", message);
    }

    public void warning(String message) {
        log("WARNING", message);
    }

    public void error(String message) {
        log("ERROR", message);
    }

    private void log(String level, String message) {
        String logMessage = "[" + level + "] " + message;
        logMessages.add(logMessage);
        System.out.println(logMessage);
    }

    public List<String> getLogMessages() {
        return logMessages;
    }
}
