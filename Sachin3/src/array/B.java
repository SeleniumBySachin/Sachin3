package array;



public class B {

	public static void main(String[] args) {
		int[]a= {20,70,80,30,10};
		for(int i=0;i<a.length;i++) {
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
		System.out.println("----------------");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
