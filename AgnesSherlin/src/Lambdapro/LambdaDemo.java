package Lambdapro;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message m = ()->{return "Heyyyyy";};
		System.out.println(m.greet());
		
		Cube c = (a)->{return (a*a*a);};
		System.out.println("Cube of num is"+ c.Calculate(8));
	}


}
