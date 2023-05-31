package Revision;

public class P5 {
	public static void add(int...a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
	}

}
