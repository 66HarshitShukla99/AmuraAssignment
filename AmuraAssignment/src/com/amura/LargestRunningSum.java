package com.amura;

import java.util.Scanner;

/*
 * @author : Harshit Shukla
 * 
 * Below approach uses Running sum for elements. Sum is calculated at each step and startIndex 
 * stores the present element index and sum keeps the sum calculated in the present iteration.
 * 
 * If at any point the sum reaches below zero,it is discarded and fresh calculation begins.
 * 
 */
public class LargestRunningSum {

	private static int startIndex;
	private static int sum;

	public static void largestRunningSuminArr(int[] arr, int n) {
		
		int temp = Integer.MIN_VALUE, 
		        end = 0, s = 0; 

		        for (int i = 0; i < n; i++)  
		        { 
		            sum += arr[i]; 
		            if (temp < sum)  
		            { 
		                temp = sum; 
		                startIndex = s; 
		                end = i; 
		            } 
		  
		            if (sum < 0)  
		            { 
		                sum = 0; 
		                s = i + 1; 
		            } 
		        } 
		        System.out.println("Largest SubArray");
		        System.out.println("Start index : " + startIndex); 
		        System.out.println("Length : " + (end-startIndex+1)); 
		        System.out.println("Sum: "+temp);
		        System.out.print("Elements :");
		        for (int i=startIndex; i <= end;i++) {
					System.out.print(" "+arr[i]);
				}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array:");
		Scanner sc = new Scanner(System.in);
		int length=sc.nextInt();
		int [] arr = new int[length];
		
		System.out.println("Enter the elements :");
		Scanner numScan= new Scanner(System.in);
		for (int j = 0; j < length; j++) {
            if (numScan.hasNextInt()) {
                arr[j] = numScan.nextInt();
            } else {
                System.out.println("You didn't provide enough numbers");
                break;
            }
        }
		
		int n = arr.length;
		largestRunningSuminArr(arr, n);	
		
	}

}
