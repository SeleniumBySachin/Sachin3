package Pattern;

public class D3 {
	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++) {
			int k=1;
			for(int j=0;j<n;j++) {
				if(i>=j) {
					System.out.print(k++ +" ");
				}
				else
					System.out.print("  ");
			}
			int a=k-1;
			for(int j=0;j<n;j++) {
				if(i>=j) {
					System.out.print(a+++" ");
				}
			}
			System.out.println();
		}
	}

}
