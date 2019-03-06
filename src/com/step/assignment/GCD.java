package com.step.assignment;

public class GCD {
  public static int getGreatestCommonDivisor(int num1,int num2){
    int gcd =1;
    if(num1 <10 || num2 <10){
      return -1;
    }
    for(int i = 1; i <= num1 && i <= num2; i++)
    {
      if(num1%i==0 && num2%i==0)
        gcd = i;
    }
    return gcd;
  }
}
