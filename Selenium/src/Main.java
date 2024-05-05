public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        // Logging example messages
        logger.info("This is an informational message.");
        logger.warning("This is a warning message.");
        logger.error("This is an error message.");

        // Retrieving logged messages
        List<String> logs = logger.getLogMessages();
        System.out.println("\nLogged Messages:");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
