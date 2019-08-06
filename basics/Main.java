import java.lang.Math;
import java.time.*;

public class Main {
  public static void main(String[] args) {

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    System.out.println(flipNHeads(1));

    clock();
  }

  public static String pluralize(String nameOfThing, int countOfThing) {
    return nameOfThing + (countOfThing == 1 ? "" : "s");
  }

  public static String flipNHeads(int n) {
    int numberOfHeadsInARow = 0;
    int numberOfFlips = 0;

    while (numberOfHeadsInARow < n) {
      numberOfFlips++;

      double headsOrTails = Math.random();

      if (headsOrTails >= 0.5) {
        numberOfHeadsInARow++;
        System.out.println("heads");

      } else {
        numberOfHeadsInARow = 0;
        System.out.println("tails");
      }
    }
    String message = "It took " + numberOfFlips + " " + pluralize("flip", numberOfFlips) + " to flip " + n + " "
        + pluralize("head", n) + " in a row.";

    return message;

  }

  public static void clock() {
    int currentSecond = 0;

    while (true) {
      LocalDateTime now = LocalDateTime.now();
      int hour = now.getHour();
      int minute = now.getMinute();
      int second = now.getSecond();

      if (currentSecond != second) {
        currentSecond = second;

        System.out.println(hour + ":" + padNumbers(minute) + ":" + padNumbers(second));
      }
    }
  }

  public static String padNumbers(int number) {
    String formattedNumber = String.valueOf(number);
    if (number < 10) {
      formattedNumber = "0" + formattedNumber;
    }
    return formattedNumber;
  }
}
