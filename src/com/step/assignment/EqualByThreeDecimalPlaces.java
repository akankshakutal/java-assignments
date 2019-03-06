package com.step.assignment;

public class EqualByThreeDecimalPlaces {

  public static boolean areEqualByThreeDecimalPlaces(double number1,double number2){
    String num1 = String.valueOf(number1).substring ( String.valueOf(number1).indexOf ( "." )+1 );
    String num2 = String.valueOf(number2).substring ( String.valueOf(number2).indexOf ( "." )+1 );
    if(num1.equals(num2)){
      return true;
    }
    return false;
  }
}
