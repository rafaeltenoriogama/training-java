public class DoWhile {
  public static void main(String[] args) {
    // Some do while loops
    int sheeps = 11;
    int sleeping = 0; // 0 for negative and 1 for positive

    do {
      for (int sheep = 1; sheep < sheeps; sheep++) {
        System.out.println("Counting sheeps to sleep: " + sheep);
        if (sheep >= 10) {
          sleeping = 1;
          System.out.println("Already pass 10 sheeps, time to sleep!");
        }
      }
    } while (sleeping == 0);
  }
}
