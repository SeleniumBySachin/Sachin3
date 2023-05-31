package array;

import java.util.Arrays;

public class Driver4 {
	public static void main(String[] args) {
		Watch []w1=new Watch[4];
		w1[0]=new Watch("Titan",5000,"Greay");
		w1[1]=new Watch("Fastrack",1000,"Blue");
		w1[2]=new Watch("HMT",6000,"Black");
		w1[3]=new Watch("Sonata",2000,"Red");
		System.out.println("Before sorting");
		for(int i=0;i<w1.length;i++) {
			System.out.println(w1[i]);
		}
		System.out.println("After sorting");
		Arrays.sort(w1, new WatchByColour());
		for(int i=0;i<w1.length;i++) {
			System.out.println(w1[i]);
			}
	}

}
