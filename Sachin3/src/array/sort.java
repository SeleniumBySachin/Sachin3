package array;

import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
       int []a= {10,30,20,50,40,90,100,60,70,80};
       System.out.println("Before sorting");
       for (int i=0;i<a.length;i++) {
    	   System.out.println(a[i]);
       }
       Arrays.sort(a,2,7);
       System.out.println("After sorting");
       for (int i=0;i<a.length;i++) {
    	   System.out.println(a[i]);
       }
	}

}
