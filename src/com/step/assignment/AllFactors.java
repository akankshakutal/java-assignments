package com.step.assignment;

public class AllFactors {
    public static void printFactors(int num){
      if(num <1 ){
        System.out.println("Invalid Value");
      }
      for(int i = 1; i <= num; i++)
      {
        if(num%i==0)
          System.out.print(i+" ");
      }
      System.out.println("\n");
    }
}
