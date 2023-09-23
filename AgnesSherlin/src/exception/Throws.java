package exception;

public class Throws {

	void display()throws NumberFormatException,ArrayIndexOutOfBoundsException
	{
		int num= Integer.parseInt("Whatsupp!!");
		int arr[]= {1,4,2,6,3};
		System.out.println(num);
		System.out.println(arr[5]);
		throw new NumberFormatException("using int for String");
	}
}
