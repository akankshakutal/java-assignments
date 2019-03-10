package com.step.assignment;

public class Sort {
    public static void main( String[] args) {
        int[] array = {6,5,4,1,2,3};
        sortArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void sortArray (int[] array){
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[i] > array[j]){
                 temp = array[i];
                 array[i] = array[j];
                 array[j] = temp;
                }
            }
        }
    }
}
