package example;

import com.github.structlog4j.ILogger;
import com.github.structlog4j.SLoggerFactory;

public class JobStringName implements Runnable {

  private final ILogger logger = SLoggerFactory.getLogger("JobStringName");

  @Override
  public void run() {
    while (true) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      logger.info("info");
    }
  }

}
