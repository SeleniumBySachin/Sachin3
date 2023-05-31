package array;

import java.util.Scanner;

public class Bubble2 {

	public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the array element");
         int size=s.nextInt();
         int []a=new int[size];
         System.out.println("Enter the values");
         for(int i=0;i<a.length;i++) {
        	 a[i]=s.nextInt();
         }
         System.out.println("The array elements ");
         for(int i=0;i<a.length;i++) {
        	 System.out.println(a[i]);
         }
         for(int i=0;i<a.length-1;i++) {
        	 for(int j=0;j<a.length-1;j++) {
        		 if(a[j]>a[j+1]) {
        			 int tem=a[j];
        			 a[j]=a[j+1];
        			 a[j+1]=tem;
        			 
        		 }
        	 }
         }
         System.out.println("After sorting the array elements ");
         for(int i=0;i<a.length;i++) {
        	 System.out.println(a[i]);
         }
	}

}
