package com.step.assignment;

public class NumberInWords {
  public static void printNumberInWords(int number){
    switch (number){
      case 0 :
        System.out.println("ZERO");
        break;
      case 1:
      System.out.println("ONE");
      break;
      case 2 :
        System.out.println("TWO");
        break;
      case 3 :
        System.out.println("THREE");
        break;
      case 4 :
        System.out.println("FOUR");
        break;
      case 5 :
        System.out.print("FIVE");
        break;
      case 6 :
        System.out.print("SIX");
        break;
      case 7 :
        System.out.print("SEVEN");
        break;
      case 8 :
        System.out.print("EIGHT");
        break;
      case 9 :
        System.out.print("NINE");
        break;
      default:
        System.out.println("Invalid Input");
    }
  }
}
