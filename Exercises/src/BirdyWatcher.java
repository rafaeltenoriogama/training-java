class BirdWatcher {
  private final int[] birdsPerDay;

  public BirdWatcher(int[] birdsPerDay) {
    this.birdsPerDay = birdsPerDay.clone();
  }

  public int[] getLastWeek() {
    // Create array with given numbers
    int[] birds_first_week = new int[] { 0, 2, 5, 3, 7, 8, 4 };

    return birds_first_week;
  }

  public int getToday() {
    // Take the last number on .birdsPerDay array
    return birdsPerDay[birdsPerDay.length - 1];
  }

  public void incrementTodaysCount() {
    // Increase in one more of the day account
    birdsPerDay[birdsPerDay.length - 1]++;
  }

  public boolean hasDayWithoutBirds() {
    // Check if in any index has zero value
    for (int i = 0; i < birdsPerDay.length; i++) {
      if ((birdsPerDay[i]) == 0) {
        return true;
      }
    }
    return false;
  }

  public int getCountForFirstDays(int numberOfDays) {
    // Int variable that will receive the total value of birds per day choosed
    int valueForDay = 0;

    // Check if number that was given is smaller than the array
    if (numberOfDays > birdsPerDay.length) {
      numberOfDays = birdsPerDay.length;
    }

    // Get number os the birds per day choosed by user
    for (int i = 0; i < numberOfDays; i++) {
      valueForDay += birdsPerDay[i];
    }
    return valueForDay;
  }

  public int getBusyDays() {
    // Int variable that willr receive how many days have more birds than 4
    int higherThanFour = 0;

    // Loop to check every index
    for (int i = 0; i < birdsPerDay.length; i++) {
      // IF command to added the ones which have higher value than 4
      if (birdsPerDay[i] > 4) {
        higherThanFour++;
      }
    }
    return higherThanFour;
  }
}
