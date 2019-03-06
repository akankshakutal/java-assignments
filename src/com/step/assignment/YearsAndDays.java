package com.step.assignment;

public class YearsAndDays {
  public static void printYearsAndDays (long minutes){
    if(minutes < 0 ){
      System.out.println("Invalid Value");
    }
    long hour =  (minutes / 60);
    long days = hour /24;
    long year = days /365;
    days = days % 365;
    System.out.println(minutes + " min = " + year + " y And " + days + " d " );
  }
}
