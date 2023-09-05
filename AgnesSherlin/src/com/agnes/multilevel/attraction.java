package com.agnes.multilevel;

public class attraction {
	String name; 
	double Ticket_price;
	
	public attraction(String n, double t)
	{
		name = n;
		Ticket_price = t;
	}
	void display()
	{
		System.out.println("Name : " + name);
		System.out.println("Ticket Price : "+ Ticket_price);
	}

}

