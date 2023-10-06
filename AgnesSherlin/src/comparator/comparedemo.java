package comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Laptop> laps= new ArrayList<Laptop>();
		laps.add(new Laptop("HP",16,50000));
		laps.add(new Laptop("Dell",12,12000));
		laps.add(new Laptop("Apple,13,100000"));
		
		Collections.sort(laps);
		for(Laptop 1:laps)
		{
			System.out.println(1);
		}

	}

}
