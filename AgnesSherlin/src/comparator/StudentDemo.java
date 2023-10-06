package comparator;
import java.util.ArrayList;
import java.util.Collections;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<compstudent> ar= new ArrayList<compstudent>();
		ar.add(new compstudent(11,"agnes","swiss"));
		ar.add(new compstudent(11,"deeps","maldives"));
		ar.add(new compstudent(11,"aaron","africa"));
		ar.add(new compstudent(11,"abisha","paris"));
		ar.add(new compstudent(11,"silvan","uk"));

		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		System.out.println("____________");
		for(int i=0;i<ar.size();i++)
		{
			Collections.sort(ar, new sortbyroll());
			System.out.println(ar.get(i));
		}
		System.out.println("____________");
		for(int i=0;i<ar.size();i++)
		{
			Collections.sort(ar, new sortbyname());
			System.out.println(ar.get(i));
		}
		
	}

}
