package example2;

public class MainLogger {

    public MainLogger() {
        AdvancedLogger logger = new AdvancedLogger();

        logger.info("This is an info message");
        logger.error("This is an error message");
    }
}
