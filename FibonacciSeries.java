
package com.Assignment.day6;

import java.util.Scanner;

public class FibonacciSeries {

	
	  public static void main(String[] args) 
	  {
		  int sum=0; int a=0,b=1; 
		  Scanner
	  sc=new Scanner(System.in);
		  System.out.println("Enter no:");
		  int
	  num=sc.nextInt();
	  
	  System.out.println(""+a+"\n"+b);
	  while(sum<num)
	  { sum=a+b; 
	  if(sum>=num)
		  break;
	  System.out.println(""+sum); 
	  a=b; b=sum;
	  
	  
	  }
	  
	  }
	 
	
}

