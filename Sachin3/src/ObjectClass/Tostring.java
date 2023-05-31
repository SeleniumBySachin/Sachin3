package ObjectClass;

public class Tostring {
        int pid;
        String brand;
        Tostring(){}
		public Tostring(int pid, String brand) {
			super();
			this.pid = pid;
			this.brand = brand;
		}
		
        public String toString() {
        	return pid+":"+brand;
        }

}
