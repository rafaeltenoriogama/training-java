public class While_loop {
  public static void main(String[] args) {
    // Some while loops
    int sheeps = 11;
    int sleep = 0; // 0 negative, 1 positive

    while (sleep <= 0) {
      for (int sheep = 1; sheep < sheeps; sheep++) {
        System.out.println("Count sheeps to sleep: " + sheep);
        if (sheep >= 10) {
          sleep = 1;
          System.out.println("Enough counting, time to sleep! ");
        }
      }
    }
  }
}
