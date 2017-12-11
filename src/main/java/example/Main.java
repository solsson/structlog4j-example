package example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(4);
    executor.submit(new JobNamedClass());
    executor.submit(new JobStatic());
    executor.submit(new JobStringName());
    executor.submit(new JobThisClass());
  }

}
