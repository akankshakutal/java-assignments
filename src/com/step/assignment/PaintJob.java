package com.step.assignment;

public class PaintJob {
    public static int getBucketCount(double width,double height,double areaPerBucket,int extra){
      if(width <= 0||height <= 0||areaPerBucket <= 0||extra < 0){
        return -1;
      }
      double wallArea = width*height;
      int bucketCount = (int) Math.ceil(wallArea/areaPerBucket);
      return bucketCount-extra;
    }
    public static int getBucketCount(double width,double height,double areaPerBucket){
      int bucketCount = getBucketCount(width, height, areaPerBucket, 0);
      return bucketCount;
    }
    public static int getBucketCount(double area,double areaPerBucket){
      int bucketCount = getBucketCount(1.0, area, areaPerBucket);
      return bucketCount;
    }
  }

