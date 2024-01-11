public class Logger {

  public static final int INFO = 1;
  public static final int DEBUG = 2;
  public static final int ERROR = 3;

  Logger nextLogger;

  Logger(Logger logger) {
    this.nextLogger = logger;
  }

  public void log(int level, String message) {
    if(nextLogger != null) {
      nextLogger.log(level, message);
    }
  }
}