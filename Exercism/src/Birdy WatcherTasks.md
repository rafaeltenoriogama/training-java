
## Some concepts

Here is the standard syntax for initializing an array:

```java
type[] variableName = new type[size];
```

The `size` is the number of elements this array will hold (which cannot be changed later). After array creation, the elements are initialized to their default values (typically `0`, `false` or `null`).

```java
// Declare array with explicit size (size is 2)
int[] twoInts = new int[2];
```

Arrays can also be defined using a shortcut notation that allows you to both create the array and set its value:

```java
// Two equivalent ways to declare and initialize an array (size is 3)
int[] threeIntsV1 = new int[] { 4, 9, 7 };
int[] threeIntsV2 = { 4, 9, 7 };
```

Array elements may be assigned and accessed using a bracketed index notation:

```java
// Assign second element by index
twoInts[1] = 8;

// Retrieve the second element by index and assign to the int element
int secondElement = twoInts[1];
```

The fact that an array is also a _collection_ means that, besides accessing values by index, you can iterate over _all_ its values using a `for-each` loop:

```java
char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

for(char vowel: vowels) {
    // Output the vowel
    System.out.print(vowel);
}

// => aeiou
```

If you want more control over which values to iterate over, a `for` loop can be used:

```java
char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

for (int i = 0; i < 3; i++) {
    // Output the vowel
    System.out.print(vowels[i]);
}

// => aei
```





## The story behind the question: 

You're an avid bird watcher who keeps track of how many birds have visited your garden in the last seven days.

You have six tasks, all dealing with the numbers of birds that visited your garden.

## The code itself:

```java


class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        // Create array with given numbers
        int[] birds_first_week = new int[] {0, 2, 5, 3, 7 ,8 ,4};

        return birds_first_week;
    }

    public int getToday() {
        // Take the last number on .birdsPerDay array
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        // Increase in one more of the day account
        birdsPerDay[birdsPerDay.length -1]++;
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
        for(int i = 0; i < numberOfDays; i++) {
            valueForDay += birdsPerDay[i];
        }
        return valueForDay;
    }

    public int getBusyDays() {
        // Int variable that willr receive how many days have more birds than 4
        int higherThanFour = 0;

        // Loop to check every index
        for( int i = 0; i < birdsPerDay.length; i++) {
            // IF command to added the ones which have higher value than 4
            if (birdsPerDay[i] > 4) {
                higherThanFour ++;
            }
        }
        return higherThanFour;
    }
}


```

## The tasks:

For comparison purposes, you always keep a copy of last week's counts nearby, which were: 0, 2, 5, 3, 7, 8 and 4. Implement the `BirdWatcher.getLastWeek()` method that returns last week's counts:

```java
BirdWatcher.getLastWeek();
// => [0, 2, 5, 3, 7, 8, 4]
```

Implement the `BirdWatcher.getToday()` method to return how many birds visited your garden today. The bird counts are ordered by day, with the first element being the count of the oldest day, and the last element being today's count.

```java
int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getToday();
// => 1
```

Implement the `BirdWatcher.incrementTodaysCount()` method to increment today's count:

```java
int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.incrementTodaysCount();
birdCount.getToday();
// => 2
```

Implement the `BirdWatcher.hasDayWithoutBirds()` method that returns `true` if there was a day at which zero birds visited the garden; otherwise, return `false`:

```java
int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.hasDayWithoutBirds();
// => true
```

Implement the `BirdWatcher.getCountForFirstDays()` method that returns the number of birds that have visited your garden from the start of the week, but limit the count to the specified number of days from the beginning of the week.

```java
int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getCountForFirstDays(4);
// => 14
```

Some days are busier than others. A busy day is one where five or more birds have visited your garden. Implement the `BirdWatcher.getBusyDays()` method to return the number of busy days:

```java
int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getBusyDays();
// => 2
```