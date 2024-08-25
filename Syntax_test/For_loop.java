public class For_loop {
  public static void main(String[] args) {
    // Make some for loops to brain muscle memory
    for (int sheeps = 0; sheeps <= 5; sheeps++) {
      System.out.println("Sheeps count in: " + sheeps);
      if (sheeps == 5) {
        System.out.println("Time to sleep!");
      }
    }

    // Dealing with arrays
    String students[] = { "Rafael", "Emiliano", "Richard", "Sirius" };

    for (int i = 0; i < students.length; i++) {
      System.out.println("Student number " + i + " is: " + students[i]);
    }

    // Dealing in a different way
    for (String student : students) {
      System.out.println("Name of the student is: " + student);
    }
  }
}
