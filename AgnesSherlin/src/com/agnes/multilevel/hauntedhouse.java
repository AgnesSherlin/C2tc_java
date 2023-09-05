package com.agnes.multilevel;

public class hauntedhouse extends attraction{

	int age_limit;
	public hauntedhouse(String s, double t, int a)
	{
		super(s,t);
		age_limit = a;
	}
	void display()
	{
		super.display();
		System.out.println("minimum Age limit: "+ age_limit);
	}
}