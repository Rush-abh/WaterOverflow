
# Water Overflow
##### Problem 

 There is a stack of water glasses in a form of triangle as illustrated. Each glass has a 250ml capacity. When a liquid is poured into the top most glass any overflow is evenly distributed between the glasses in the next row. That is, half of the overflow pours into the left glass while the remainder of the overflow pours into the right glass. 

Write a program that is able to calculate and illustrate how much liquid is in the j-th glass of the i-th row when K litres are poured into the top most glass. The solution can be a command line tool or have a graphical interface.


## Quick Start

#### JAVA

You will need JAVA with JRE with Java SE 15(sep 2020) installed and setup on your system. Moreover, for test cases you'll need to install the JUnit 4.10 or higher. If your system does not have it, I recommend installing it from (https://junit.org/junit4/). **No other dependencies should be required**.

1. Clone this repo.

   ```bash
   git clone https://github.com/Rush-abh/WaterOverflow.git
   ```

2. Open Project.

   ```bash
   open project in code editor
   ```

3. Run the Main file.

   ```bash
   Run "WaterOverflowMain.java" as Java Application
   ```

## OR

2. Open folder with executable(jar) file.

   ```bash
    WaterOverflow.jar
   ```

3. Open cmd in folder and Run the JAR file command.

   ```bash
   Press ALT+D, type cmd, hit enter
   ```
   ```bash
   java -jar WaterOverflow.jar
   ```
You should see the expected output according to custom input. Try with different values of `k` `i` and `j` to see the results.
E.g for input (4,5,5)
```
Amount of water in 5th glass of 5 row is: 15.625
```

> **Note**: This implementation has limitation set of K till 10. The input assumes i and j starts from 1.


## Testing

The project utilises the JUnit for developing the test cases of application. 
The tests on this program tries to prove out the basic functionality.
See file in test package `src/tests/WOTests.java`






