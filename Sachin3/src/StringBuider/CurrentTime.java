package StringBuider;

public class CurrentTime {
	public static void main(String[] args) {
	  StringBuffer s1=new StringBuffer();
	  StringBuilder s2=new StringBuilder();
	  long start1=System.currentTimeMillis();
	  for(int i=0;i<=100000;i++) {
		  s1.append("Sheela");
	  }
	  long end1=System.currentTimeMillis();
	  long timeTaken1=end1-start1;
	  
	  long start2=System.currentTimeMillis();
	  for(int i=0;i<=100000;i++) {
		  s2.append("Sheela");
	  }
	  long end2=System.currentTimeMillis();
	  long timeTaken2=end2-start2;
	  
	  System.out.println(timeTaken1);
	  System.out.println(timeTaken2);
	}

}
