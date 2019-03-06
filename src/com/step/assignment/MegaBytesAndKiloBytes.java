package com.step.assignment;

public class MegaBytesAndKiloBytes {

  public static String printMegaBytesAndKiloBytes(int kiloBytes){
    if(kiloBytes < 0 ){
      return "Invalid Value";
    }
    int megabytes = kiloBytes /1024;
    int remainingKiloBytes = kiloBytes % 1024;
    return (kiloBytes + " KB = " +megabytes + " MB and " + remainingKiloBytes + " KB") ;
  }
}
