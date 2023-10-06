package comparator;

public class compstudent {
	int rollno;
	String name,address;
	public compstudent(int rollno, String name, String address) {
		super();
		this.rollno= rollno;
		this.name= name;
		this.address= address;
	}
	@Override
	public String toString() {
		return "compstudent [rollno="+rollno+",name="+name+",address="+address+"]";
	}

}
