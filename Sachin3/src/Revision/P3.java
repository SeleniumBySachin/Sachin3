package Revision;

public class P3 {
   public static void main(String[] args) {
	int a=40,b=90,c=30;
	int res=a<b?a:b;
	int res1=res<c?res:c;
	System.out.println(res<res1?res:res1);
	System.out.println(a<b?a<c?a:c:b<c?b:c);
}

}
