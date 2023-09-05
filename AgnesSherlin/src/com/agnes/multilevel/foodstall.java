package com.agnes.multilevel;

public class foodstall extends attraction{

	String cuisine;
	public foodstall(String n, double t, String c)
	{
		super(n,t);
		cuisine = c;
	}
	void display()
	{
		super.display();
		System.out.println("Cuisine type : "+ cuisine);
	}
	
}
