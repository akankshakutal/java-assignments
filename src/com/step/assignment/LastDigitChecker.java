package com.step.assignment;

public class LastDigitChecker {
  public static boolean isValid(int num){
    if(num <10 || num >1000){
      return false;
    }
    return true;
  }

  public static boolean hasSameLastDigit (int a,int b,int c){
    if(a <10 || a>1000 ||b <10 || b>1000 || c<10||c>1000){
      return false;
    }
    int lasta = a %10;
    int lastb = b %10;
    int lastc = c%10;
    if(lasta == lastb || lasta == lastc || lastb == lastc){
      return true;
    }
    return false;
  }
}
