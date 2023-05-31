package Practice1;

public class S {
	public static void main(String[] args) {
		int []a={10,20,30,40};
		System.out.println(a.length); 
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		int []b=new int[2];
		b[0]=20;
		b[1]=10;
		
		System.out.println(b.length);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
	}
}
