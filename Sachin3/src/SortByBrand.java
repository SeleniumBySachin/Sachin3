import java.util.Comparator;

public class SortByBrand implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Bike1 b1=(Bike1)o1;
		Bike1 b2=(Bike1)o2;
				return b1.brand.compareTo(b2.brand);
	}

}
