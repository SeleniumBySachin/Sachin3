package array;

import java.util.Arrays;

public class WatchDriver {
	public static void main(String[] args) {
		Watch1[]w1=new Watch1[4];
		w1[0]=new Watch1(103,2000,"Titan");
		w1[1]=new Watch1(104,1800,"Sonata");
		w1[2]=new Watch1(101,2500,"Fosill");
		w1[3]=new Watch1(102,1000,"HMT");
		for(int i=0;i<w1.length;i++) {
			System.out.println(w1[i]);
		}
		System.out.println("---------------------");
		Arrays.sort(w1,new Watch1());
		for(int i=0;i<w1.length;i++) {
			System.out.println(w1[i]);
		}
	}

}
