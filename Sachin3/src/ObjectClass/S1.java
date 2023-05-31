package ObjectClass;

import java.util.Objects;

public class S1 {
	int i;
	int j;
	int k;
	S1(){}
	public S1(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	public S1(int i, int j,int k) {
		super();
		this.i = i;
		this.j = j;
		this.k=k;
	}
	@Override
	public String toString() {
		return "S1 [i=" + i + ", j=" + j + "]";
	}
	@Override
	public int hashCode() {
		int hc=0;
		hc+=i;
		hc+=j;
		
		return hc;
	}
	@Override
	public boolean equals(Object o) {
		S1 obj=(S1)o;
		return this.i==obj.i &&
				this.j==obj.j;
	}
	 
}
