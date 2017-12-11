package example;

import com.github.structlog4j.ILogger;
import com.github.structlog4j.SLoggerFactory;

public class JobThisClass implements Runnable {

  private final ILogger logger = SLoggerFactory.getLogger(this.getClass());

  @Override
  public void run() {
    while (true) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      logger.info("info", "equal?", this.getClass() == JobThisClass.class);
    }
  }

}
