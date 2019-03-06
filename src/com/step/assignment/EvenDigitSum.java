package com.step.assignment;

public class EvenDigitSum {
  public static int getEvenDigitSum(int number){
    int reminder =0,addition=0;

    if(number < 0 ){
      return -1;
    }

    while (number != 0){
      reminder = number %10;
      if(reminder %2 == 0){
        addition += reminder;
      }
      number =number /10;
    }
      return addition;
  }
}
