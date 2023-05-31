package Revision;

public class P4 {
//WAJP to find sum of 2 no,3 no,4no by using var arrgs method
	
	public static int add(int...a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
		System.out.println(add(10,20,30,40));
	}
	
	
}
