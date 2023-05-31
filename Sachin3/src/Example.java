import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		int[]a= {30,50,20,10,40,80,100,90,60,70};
		System.out.println("Before sorting");
		for(int i=0;i<a.length-1;i++) {
			System.out.println(a[i]);
		}
		Arrays.sort(a,3,8);
		System.out.println("After sorting");
		for(int i=0;i<a.length-1;i++) {
			System.out.println(a[i]);
		}
	}

}
