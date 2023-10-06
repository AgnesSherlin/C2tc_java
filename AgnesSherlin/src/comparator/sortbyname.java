package comparator;
import java.util.Comparator;

public class sortbyname implements Comparator<compstudent>{
	
	@Override
	public int compare(compstudent a,compstudent b) {
		return a.name.compareTo(b.name);
	}

}
