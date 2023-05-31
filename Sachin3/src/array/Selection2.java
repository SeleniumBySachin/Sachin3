package array;

import java.util.Scanner;

public class Selection2 {

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
	      
	      for(int i=0;i<a.length-1;i++) {
	    	  int pos=i;
	    	  for(int j=1+i;j<a.length;j++) {
	    		  if(a[pos]>a[j]) {
	    			  pos=j;
	    		  }
	    	  }
	    	  if(a[pos]!=a[i]) {
	    		  int tem=a[i];
	    		  a[i]=a[pos];
	    		  a[pos]=tem;
		    	  
		      }
	      }
	      System.out.println("After sorting array elements are: ");
	      for(int i=0;i<a.length;i++) {
	    	  System.out.println(a[i]);
	      }
	     
	}

}
