package Pattern;

public class P3 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			char ch='a';
			for(int j=0;j<n;j++) {
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}

}
