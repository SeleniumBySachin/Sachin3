package array;

public class A {

	public static void main(String[] args) {
		int []a= {50,30,10,20,40};
		System.out.println("Before sorting");
		for(int i=0;i<a.length-1;i++) {
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int tem=a[j];
					a[j]=a[j+1];
					a[j+1]=tem;
				}
			}
		}
		System.out.println("After sorting");
		for(int i=0;i<a.length-1;i++) {
			System.out.println(a[i]);
		}
	}

}
