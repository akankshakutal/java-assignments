package com.step.assignment;

public class LargestPrime {
  public static int getLargestPrime(int number){
    int result = -1;
    for(int i = number-1; i >= 1 ; i--) {
      if (number % i == 0 && isPrime(i)) {
        result = i;
        break;
      }
    }
    return result;
  }

  private static boolean isPrime(int number) {
    if(number ==2 || number ==3 ||  number ==5|| number==7){
      return true;
    }
    return (number%2 !=0 && number %3 != 0 && number%5 !=0 && number%7 != 0);
  }
}
