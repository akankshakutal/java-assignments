package com.step.assignment;

public class LeapYear {
  public static boolean isLeapYear(int year){
    if(year < 1 || year > 9999 ){
      return false;
    }
    if(year % 4 == 0){
      return true;
    }
    return false;
  }

  public static int getDaysInMonth(int month, int year){
    int result;
    if(year < 1 || year > 9999 || month <1 || month >12 ){
      return -1;
    }
    switch (month){
      case 1 :
        result = 31;
        break;
      case 2 :
        if(isLeapYear(year)){
          result = 29;
        }else
        result = 28;
        break;
      case 3 :
        result = 31;
        break;
      case 4 :
        result = 30;
      break;
      case 5 :
        result = 31;
      break;
      case 6 :
        result = 30;
      break;
      case 7 :
        result = 31;
      break;
      case 8 :
        result = 30;
      break;
      case 9 :
        result = 31;
      break;
      case 10 :
        result = 30;
      break;
      case 11 :
        result = 31;
      break;
      case 12 :
        result = 30;
      break;
      default:
        return -1;
    }
    return result;
  }
}
