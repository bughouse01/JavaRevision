package com.dmk.utils;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

public class CodalityLessonsTest {

  @Test
  public void testBinaryGap() {  
    assertTrue(CodalityLessons.getMaxGapLEngth(1041) == 5);
  }
  
  @Test
  public void testCollectionRotate() {
    
    int[] intArray = {3,8,9,7,6};
    int[] resultArray = {9,7,6,3,8};
    int[] rotatedArray = CodalityLessons.rotateArrayWithCollections(intArray, 3);
    
    assertTrue(Arrays.equals(rotatedArray, resultArray));
    
  }

  @Test
  public void testLoopRotate() {
    
    int[] intArray = {3,8,9,7,6};
    int[] resultArray = {9,7,6,3,8};
    int[] rotatedArray = CodalityLessons.rotateArrayWithLoop(intArray, 3);
    
    assertTrue(Arrays.equals(rotatedArray, resultArray));
    
  }
  
}
