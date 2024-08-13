#### Try make a lasagna

```java
public class Lasagna {
    // Define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        //No arguments
        return 40;
    }

    // Define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int ActualMinutes) {
        // Minutes remaining means Expected - Actual = 40 - N = Remaining
        return expectedMinutesInOven() - ActualMinutes;
    }

    // Define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layersAdded) {
        int layersTime = 2;
        return layersAdded * layersTime;
    }

    // Define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberLayers, int ovenTimeLasagna) {
        // How many layers I add plus the time to make them
        // How many minutes the lasagna was on the oven
        // I can use the parameter (numberLayers * 2) but will reuse the last method instead to good maintainability
        return preparationTimeInMinutes(numberLayers) + ovenTimeLasagna;
    }
}
```

#### Tha task are below

Define the `expectedMinutesInOven()` method that does not take any parameters and returns how many minutes the lasagna should be in the oven. According to the cooking book, the expected oven time in minutes is 40:

```java
Lasagna lasagna = new Lasagna();
lasagna.expectedMinutesInOven();
// => 40
```

Define the `remainingMinutesInOven()` method that takes the actual minutes the lasagna has been in the oven as a parameter and returns how many minutes the lasagna still has to remain in the oven, based on the expected oven time in minutes from the previous task.

```java
Lasagna lasagna = new Lasagna();
lasagna.remainingMinutesInOven(30);
// => 10
```

Define the `preparationTimeInMinutes()` method that takes the number of layers you added to the lasagna as a parameter and returns how many minutes you spent preparing the lasagna, assuming each layer takes you 2 minutes to prepare.

```java
Lasagna lasagna = new Lasagna();
lasagna.preparationTimeInMinutes(2);
// => 4
```

Define the `totalTimeInMinutes()` method that takes two parameters: the first parameter is the number of layers you added to the lasagna, and the second parameter is the number of minutes the lasagna has been in the oven. The function should return how many minutes in total you've worked on cooking the lasagna, which is the sum of the preparation time in minutes, and the time in minutes the lasagna has spent in the oven at the moment.

```java
Lasagna lasagna = new Lasagna();
lasagna.totalTimeInMinutes(3, 20);
// => 26
```