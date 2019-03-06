package com.step.assignment;

import java.text.DecimalFormat;

public class Area {

  public static double calculateArea(double radius){
    if(radius <0){
      return -1.0;
    }

    String pattern = "###,###.#####";
    DecimalFormat decimalFormat = new DecimalFormat(pattern);
    String format = decimalFormat.format(Math.PI * radius * radius);
    return  Double.valueOf(format);
  }

  public static double calculateArea(double x,double y){
    if( x <0 || y < 0 ){
      return -1.0;
    }
    return x * y;
  }
}
