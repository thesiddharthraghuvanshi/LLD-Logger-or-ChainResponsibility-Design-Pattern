

class Main {
  public static void main(String[] args) {

    Logger logger = new ErrorLogger(new DebugLogger(new InfoLogger(null)));

    logger.log(Logger.INFO, "information");
    logger.log(Logger.DEBUG, "debugging");
    logger.log(Logger.ERROR, "error");
  }
}