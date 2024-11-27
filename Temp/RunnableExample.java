public class RunnableExample implements Runnable {
  public void run() {
      for (int i = 1; i <= 3; i++) {
          System.out.println(Thread.currentThread().getName() + " Running step " + i);
          try {
            Thread.sleep(500);
          } catch (Exception e) {}
      }
  }
  public static void main(String[] args) {
      Thread thread = new Thread(new RunnableExample());
      Thread thread2 = new Thread(new RunnableExample());
      thread.start();
      thread2.start();
    }
}