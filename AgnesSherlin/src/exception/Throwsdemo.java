package exception;

public class Throwsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throws ob = new Throws();
		try
		{
			ob.display();
		}
        catch(NumberFormatException e1)
		{
        	System.out.println("Exception caught:" + e1.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("Exception caught:" + e2.getMessage());
		}
	}

}
