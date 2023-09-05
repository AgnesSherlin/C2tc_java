package com.agnes.multilevel;

public class demomultilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---Theme Park---");
		attraction obj = new attraction("Magic show", 50);
		obj.display();
		attraction obj1 = new rollercoaster("Roller coaster", 30, 7);
		obj1.display();
		attraction obj2 = new hauntedhouse("Haunted house", 40, 18);
		obj2.display();
		attraction obj3 = new foodstall("Pizza house", 15, "Mexican style");
		obj3.display();
		
	}

}
