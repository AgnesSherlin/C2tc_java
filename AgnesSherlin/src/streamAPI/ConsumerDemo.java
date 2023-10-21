package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
	
		//consumerInterface
		List<String> cars = new ArrayList<>();
		cars.add("KIA Seltos");
		cars.add("MG Harrier");
		cars.add("Jeep");
		
		System.out.println(cars);
		Consumer<String> p = car->System.out.println(car);
		cars.forEach(p);
		}
	
		
}