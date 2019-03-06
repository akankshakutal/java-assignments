package com.step.assignment;

public class Teen {

  public static boolean hasTeen(int a,int b,int c){
    if(a>=13 && a<=19){
      return true;
    }
    if(b>=13 && b<=19){
      return true;
    }
    if(c>=13 && c<=19){
      return true;
    }
    return false;
  }
  public static boolean hasTeen(int a){
    if(a>=13 && a<=19){
      return true;
    }
    return false;
  }
}
