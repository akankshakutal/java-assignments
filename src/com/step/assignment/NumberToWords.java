package com.step.assignment;

public class NumberToWords {

  public static void printNumberToWords(int number){
    if(number < 0) {
      System.out.println("Invalid Value");
      return;
    }
    int reverse = reverse(number);
    while (number != 0 ){
      int reminder = reverse %10;
      NumberInWords.printNumberInWords(reminder);
      reverse /= 10;
      number /= 10;
    }
  }

  public static int reverse(int number){
    int reverse = 0;
    int reminder = 0;
    number = Math.abs(number);
    while (number  > 0 ){
      reminder = number %10;
      reverse = reverse * 10 + reminder;
      number = number / 10;
    }
    return reverse;
  }

  public static int getDigitCount(int number){
    if(number  < 0) {
      return -1;
    }
    int count = 0;
    do{
      number = number / 10;
      ++count;
    }while (number  > 0 );
    return count;
  }
}
