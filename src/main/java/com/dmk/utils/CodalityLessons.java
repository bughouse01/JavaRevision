package com.dmk.utils;

import java.util.Arrays;
import java.util.Collections;

public class CodalityLessons {
  public static void main(String[] args) {
  	
    
    getMaxGapLEngth(1041);
  	
  	int[] intArray = {3,8,9,7,6};
  	
  	rotateArrayWithCollections(intArray, 3);
  	rotateArrayWithLoop(intArray, 3);
  }
  
  //Binary gap 
  public static int getMaxGapLEngth(int n) {
    String[] stringArray = Integer.toBinaryString(n).split("[1]");
    int maxLength = 0;
    
    for(String str : stringArray) {
      
      	if(str.length() > maxLength) {
      		maxLength=str.length();
      	} 
    }
    return maxLength;
  }
  
  //Rotate an array using collections
  public static int[] rotateArrayWithCollections(int[] a, int k) {
  
    Integer[] arr = Arrays.stream(a).boxed().toArray(Integer[]::new);
    Collections.rotate(Arrays.asList(arr), k);
    System.out.println(Arrays.toString(arr));
    return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
  }
  
  //Rotate an array using loops
  public static int[] rotateArrayWithLoop(int[] intArray, int rotations) {
    
    int[] newArray = new int[5];
    
    for(int x = 0; x <= intArray.length-1; x++){
        newArray[(x+rotations) % intArray.length ] = intArray[x];
    }
    
    return newArray;
    
  }
}
