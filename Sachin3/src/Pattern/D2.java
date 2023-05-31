package Pattern;

public class D2 {
	public static void main(String[] args) {
		int n=5;
		int k=1;
		int a;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j) {
					System.out.print(k+++" ");
				}
				else
					System.out.print("  ");
			}
		a=k-1;
			for(int j=0;j<n;j++) {
				if(i>=j) {
					System.out.print(a--+" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
			
		}
	}

}
