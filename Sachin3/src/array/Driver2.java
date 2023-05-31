package array;

import java.util.Arrays;

public class Driver2 {
	public static void main(String[] args) {
		Car[]c1=new Car[4];
		c1[0]=new Car(10000,"BMW",4);
		c1[1]=new Car(60000,"Maruthi", 4);
		c1[2]=new Car(40000,"Toyota",4);
		c1[3]=new Car(20000,"KIA",4);
		System.out.println("Before sorting");
		for(int i=0;i<c1.length;i++) {
			System.out.println(c1[i]);
		}
		Arrays.sort(c1);
		System.out.println("After sorting");
		for(int i=0;i<c1.length;i++) {
			System.out.println(c1[i]);
		}
	}

}
