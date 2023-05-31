package Pattern;

public class P12 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			int k=1;
			char ch='e';
			for(int j=0;j<n;j++) {
				if(i%2==0) {
					System.out.print(ch-- +" ");
				}
				else
					System.out.print(k++ +" ");
			}
			System.out.println();
		}
	}

}
