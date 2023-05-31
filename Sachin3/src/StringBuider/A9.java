package StringBuider;

public class A9 {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer();
		StringBuilder s2=new StringBuilder();
		long start1=System.currentTimeMillis();
		for(int i=0;i<=100000;i++) {
			s1.append("Dinga");
		}
		long end1=System.currentTimeMillis();
		long timetaken1=end1-start1;
		
		long start2=System.currentTimeMillis();
		for(int i=0;i<=100000;i++) {
			s2.append("Dinga");
		}
		long end2=System.currentTimeMillis();
		long timetaken2=end2-start2;
		
		System.out.println(timetaken1);
		System.out.println(timetaken2);
		
	}

}
