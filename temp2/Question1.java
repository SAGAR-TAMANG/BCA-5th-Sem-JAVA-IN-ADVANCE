class Question1 implements Runnable {
  public void run() {
    for (int i = 1; i != 3; i++) {
      System.out.println(Thread.currentThread().getName() + " Running Step " + i);
    
      try {
        Thread.sleep(500);
      } catch (Exception e) {}
    }
  }

  public static void main(String[] args) {
    Thread thread1 = new Thread(new Question1());
    Thread thread2 = new Thread(new Question1());

    thread1.start();
    thread2.start();
  }
}