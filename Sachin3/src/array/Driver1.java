package array;

import java.util.Arrays;

public class Driver1 {

	public static void main(String[] args) {
        P[] p1=new P[4];
        p1[0]=new P(50000,"BMW",4);
        p1[1]=new P(20000,"Maruthi",4);
        p1[2]=new P(10000,"KIA",4);
        p1[3]=new P(40000,"Toyota",4);
        System.out.println("Before sorting");
        for(int i=0;i<p1.length;i++) {
        	System.out.println(p1[i]);
        }
        System.out.println("After sorting");
        Arrays.sort(p1);
        for(int i=0;i<p1.length;i++) {
        	System.out.println(p1[i]);
        }
     
	}
	

}
