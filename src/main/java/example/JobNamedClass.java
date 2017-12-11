package example;

import com.github.structlog4j.ILogger;
import com.github.structlog4j.SLoggerFactory;

public class JobNamedClass implements Runnable {

  private final ILogger logger = SLoggerFactory.getLogger(JobNamedClass.class);

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
