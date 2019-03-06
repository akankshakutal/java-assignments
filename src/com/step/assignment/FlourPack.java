package com.step.assignment;

public class FlourPack {
  public static boolean canPack (int bigCount,int smallCount,int goal){
    int remaining = goal - bigCount*5;
    if(bigCount<0||smallCount<0||goal<0){
      return false;
    }
    if(remaining<0){
      remaining = goal%5;
    }
    remaining = remaining - smallCount*1;
    return remaining <= 0;

  }
}
