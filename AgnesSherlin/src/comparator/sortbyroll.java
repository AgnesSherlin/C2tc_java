package comparator;
import java.util.Comparator;

public class sortbyroll implements Comparator<compstudent>{
	
	@Override
	public int compare(compstudent a,compstudent b) {
		return b.rollno-a.rollno;
	}

}
