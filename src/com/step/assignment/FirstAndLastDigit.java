package com.step.assignment;

public class FirstAndLastDigit {
  public static int sumFirstAndLastDigit(int number){
    if(number < 0){
      return -1;
    }
    int first =number ,last = 0;
    while (first >= 10){
        first = first /10;
    }
    last = number %10;
    return first + last;
  }
}
