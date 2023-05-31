package array;

public class Selection {
	public static void main(String[] args) {
		int[]a= {40,30,10,50,20};
		System.out.println("Before sorting");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++) {
			int pos=i;
			for(int j=1+i;j<a.length;j++) {
				if(a[pos]>a[j]) {
					pos=j;
				}
			}
			if(pos!=i) {
				int tem=a[i];
				a[i]=a[pos];
				a[pos]=tem;
				
			}
		}
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
