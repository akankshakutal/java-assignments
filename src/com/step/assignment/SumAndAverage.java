package com.step.assignment;

import java.util.Scanner;

public class SumAndAverage {
  public static void inputThenPrintSumAndAverage(){
    float sum =0,count =0 ;
    int avg = 0;
    Scanner scanner = new Scanner(System.in);
    while(scanner.hasNextInt()) {
        sum += scanner.nextInt();
        count++;
        avg = Math.round(sum /count);
    }
    System.out.println("SUM = "+(int) sum + " AVG = "+ avg );
  }
}
