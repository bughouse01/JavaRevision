package com.dmk.utils;

import java.util.Arrays;
import java.util.Collections;

public class CodalityLessons {
	public static void main(String[] args) {
		//getMaxGapLEngth(1041);
		
		int[] intArray = {3,8,9,7,6};
		
		rotateArray(intArray, 3);
	}
	
	public static int getMaxGapLEngth(int n) {
		String[] stringArray = Integer.toBinaryString(n).split("[1]");
		int maxLength = 0;
		
		for(String str : stringArray) {
			if(str.length() > maxLength) {
				maxLength=str.length();
			}
		}
		
		//String max = Collections.max(Str, Comparator.comparing(s -> s.length()));
		
		System.out.println(maxLength);
		
		return maxLength;
	}
	
	public static int[] rotateArray(int[] A, int K) {

		Integer[] arr = Arrays.stream(A).boxed().toArray(Integer[]::new);
		Collections.rotate(Arrays.asList(arr), K);
		System.out.println(Arrays.toString(arr));
		return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
	}
	
}
