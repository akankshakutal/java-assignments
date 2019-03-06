package com.step.assignment;

public class PlayingCat {
  public static boolean isCatPlaying(boolean summer, int temperature){

    if(temperature <= 35 && temperature >= 25 && summer == false){
      return true;
    }

    if(summer == true && temperature >=25 && temperature <= 45 ){
      return true;
    }

    return false;
  }
}
