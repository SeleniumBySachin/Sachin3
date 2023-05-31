package array;

import java.util.Scanner;

public class Linear {

	public static void main(String[] args) {
	
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the array element");
      int size=s.nextInt();
      int[]a=new int[size];
      System.out.println("Enter the values");
      for(int i=0;i<size;i++) {
    	  a[i]=s.nextInt();
      }
      System.out.println("The array elements are: ");
      for(int i=0;i<a.length;i++) {
    	  System.out.println(a[i]);
      }
      System.out.println("Enter the searching element");
      int key=s.nextInt();
      int c=0;
      for(int i=0;i<size;i++) {
    	  if(a[i]==key) {
    		  c++;
    		  break;
    	  }
    		
    	
         }
      if(c==1) {
    	  System.out.println(key+": it is found in array");

	  }
	 
	  else
	  {
		  System.out.println(key+": it is not found in array");
	  }

      
    } 
      
      
	}


