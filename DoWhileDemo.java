package com.accenture.lkm.simplejavaprograms;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int count=0;
                   int number;
	       String s="no";
	       Scanner sc=new Scanner(System.in);
	       do {
	    	   count++;
	    	   System.out.println("Do noWhile is executing! to continue type yes ");
	    	   s=sc.next();
	       }while(s.equals("yes"));
	       System.out.println(count+" times while executed");
	}

}
