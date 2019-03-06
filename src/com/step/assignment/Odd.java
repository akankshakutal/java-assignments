package com.step.assignment;

public class Odd {

  public static boolean isOdd(int number){
    if(number > 0 && number%2 != 0){
      return true;
    }
    return false;
  }

  public static int sumOdd(int start, int end){
    int addition = 0;

    if(end < start || start <0 || end <0){
      return -1;
    }

    for(int num= start; num<= end; num++){
      if(isOdd(num)){
        addition += num;
      }
    }
    return addition;
  }
}
