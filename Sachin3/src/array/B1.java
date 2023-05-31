package array;

import java.util.Arrays;

public class B1 {

	public static void main(String[] args) {
		int[]a= {20,30,10,50,40,90,80,35,100,45};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				int largest=j;
				if(a[largest]>a[j+1]) {
					int tem=a[largest];
					a[largest]=a[j+1];
					a[j+1]=tem;
				}
			}
		  
		}
		System.out.println("----------------");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
