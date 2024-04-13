package com.Spring.beans;

import java.util.Date;

public class MassageGenerator {
	
	private Date date;
	
	public void setDate(Date date) {
		this.date=date;
		System.out.println("Setter method Calling");
		System.out.println(date);
	}
	
	public MassageGenerator(Date date) {
		this.date=date;
		System.out.println("Constructor Calling");
		System.out.println(date);
	}
	
	
	public String grtMassage(String name) {
		
		int time=0;
		time=date.getHours();
		
		if(time<12) {
			return "GOOD MORNING " +name;
		}
		else if (time<16) {
			
			return "GOOD NOON "+ name;
		}
        else if (time<20) {
			
			return "GOOD AFTERNOON "+ name;
		}
		return "GOOD NIGHT "+name;
	}

}
