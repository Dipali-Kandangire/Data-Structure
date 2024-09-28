package com.DataStructure;

public class LinearSearch {
	public static int lisearch(int number[],int key) {
		
	    
		for(int i=0;i<number.length;i++) {
			if(number[i]==key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {2,4,6,8,10};
		int key=6;
		
		int index=lisearch(numbers,key);
		if(index==-1) {
			System.out.println("not found");
		}
		else {
			System.out.println("key is at index:"+index);
		}

	}

}
