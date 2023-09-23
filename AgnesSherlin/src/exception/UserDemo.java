package exception;

public class UserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Userdefined.validate();
		}
		catch(Age e)
		{
			System.out.println("Exception is caught:" + e.getMessage());
		}

	}

}
