package com.DataStructure;

public class Binary_Search {
	public static int BinarySearch(int numbers[],int key) {
		
		int start=0,end=numbers.length-1;
		while(start <= end) {
			int mid=(start+end)/2;
			
			//comparison
			if(numbers[mid]==key) {
				return mid;
			}
			if(numbers[mid]<key) {
				start =mid+1;
			}
			else {
				end=mid-1;
			}
		}
		
		
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {2,4,6,8,10,13,14,16};
		int key=14;
		
		System.out.println("key is at index:"+BinarySearch(numbers,key));

	}

}
