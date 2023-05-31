package Wrapper;

public class P6 {
	public static void main(String[] args) {
		int count =0;
		int num=7;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("It is an prime no");
		}
		else
			System.out.println("It is not a prime no");
	}

}
