package array;

import java.util.Comparator;

public class WatchByColour implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Watch w1=(Watch)o1;
		Watch w2=(Watch)o2;
		return w1.brand.compareTo(w2.brand);
	}

}
