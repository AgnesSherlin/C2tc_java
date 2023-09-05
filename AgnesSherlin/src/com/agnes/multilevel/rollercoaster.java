package com.agnes.multilevel;

public class rollercoaster extends attraction{

	int Thrill_level;
	public rollercoaster(String n, double t, int l)
	{
		super(n,t);
		Thrill_level = l;
	}
	void display()
	{
		super.display();
		System.out.println("Thrill level : "+ Thrill_level);
	}
}