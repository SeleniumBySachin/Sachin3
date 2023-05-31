package array;

import java.util.Arrays;

public class Driver3 {

	public static void main(String[] args) {
       Laptop[]l1=new Laptop[4];
       l1[0]=new Laptop(12,69999,"Dell");
       l1[1]=new Laptop(4,59999,"Asus");
       l1[2]=new Laptop(6,79999,"Lenovo");
       l1[3]=new Laptop(8,49999,"HP");
       
       System.out.println("Before sorting");
		for(int i=0;i<l1.length;i++) {
			System.out.println(l1[i]);
		}
		System.out.println("After sorting");
		Arrays.sort(l1,new SortByRam());
		for(int i=0;i<l1.length;i++) {
			System.out.println(l1[i]);
		}
		System.out.println("After sorting");
		Arrays.sort(l1,new SortByPrice());
		for(int i=0;i<l1.length;i++) {
			System.out.println(l1[i]);
		}
		System.out.println("After sorting");
		Arrays.sort(l1,new SortByBrand());
		for(int i=0;i<l1.length;i++) {
			System.out.println(l1[i]);
		}
		
	}

}
