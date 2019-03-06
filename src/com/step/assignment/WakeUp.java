package com.step.assignment;

public class WakeUp {

  public static boolean shouldWakeUp(boolean barking,int hourOfDay){
    boolean result = false;
    if(hourOfDay < 8 &&  hourOfDay > 0 && barking == true ){
       result = true;
    } else if(hourOfDay > 22 && barking == true ){
      result = true;
    } else {
      result = false;
    }
    return result;
  }
}
