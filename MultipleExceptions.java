package com.trial.interviews;

public class MultipleExceptions {
	
	//Catching Multiple exceptions was introduced in Java 7
	
	public static void main(String[] args) {
		int arr[] = {1,2,3};
		
		try {
			for(int i =0; i<= arr.length+1 ;i++ ) {
				System.out.println(arr[i]);
			}
		}catch (NullPointerException | ArrayIndexOutOfBoundsException ex) {
			
			System.out.println(ex);
			
		}
	}

}
