package com.java.array;

public class dimArray {


	public static void main(String[] args) {
		

int[][] arr = new int[3][3] ;

arr[0][0]=1;

arr[0][1]=2;

arr[0][2]=3;

arr[1][0]=0;

arr[1][1]=5;

arr[1][2]=6;

arr[2][0]=7;

arr[2][1]=0;

arr[2][2]=1;

int valueOfI = 0;
int valueofJ=0;
int i,j;

for( i=0;i< arr.length;i++){
	for( j=0;j< arr.length;j++){
	//	System.out.println(arr[i][j]);
	if(arr[i][j]==0)
	{
		valueOfI=i;
		valueofJ=j;
		
		break;
	}
	
	}
}
System.out.println(" valueOfI"+valueOfI+" valueOfJ"+valueofJ);
	for(i=0;i< arr.length;i++){
		for( j=0;j< arr.length;j++){
			if(valueOfI==i || valueofJ==j) {
				arr[i][j]=0;
				System.out.println("I:"+i+" J :"+j+" : arr::"+arr[i][j]);
			}
	}
	}
	
}	
}
	
		// TODO Auto-generated method stub

