package array;

public class Bubble1 {
	public static void main(String[] args) {
		int [] a= {30,70,60,20,};
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("-------------------------");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j]; 
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
