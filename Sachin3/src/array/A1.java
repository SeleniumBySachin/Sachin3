package array;

public class A1 {
	public static void main(String[] args) {
		int []a= {40,30,10,50,20};
		System.out.println("Before sorting");
		for(int i=0;i<a.length-1;i++) {
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length-1;i++) {
			int pos=i;
			for(int j=i+1;j<a.length-1;j++) {
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
		for(int i=0;i<a.length-1;i++) {
			System.out.println(a[i]);
		}
	
		
	}

}
