public class DebugLogger extends Logger {

  DebugLogger(Logger nextLogger){
    super(nextLogger);
  }

  public void log(int level, String message) {
    if(level == DEBUG) {
      System.out.println("DEBUG: " + message);
    } else {
      super.log(level, message);
    }
  }
}