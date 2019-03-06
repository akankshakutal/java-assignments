package com.step.assignment;

public class Equal {
  public static void printEqual(int a,int b,int c){
    String msg = "Neither all are equal or different";
    if(a == b && b==c && a==c){
      msg = "All numbers are equal";
    }
    if(a< 0 || b< 0|| c<0){
      msg = "Invalid value";
    }
    if(a != b && b!=c && a!=c){
      msg ="All numbers are Different";
    }
    System.out.println(msg);
  }
}
