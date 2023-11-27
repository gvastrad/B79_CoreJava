package com.tnsif.inheritance;

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
	    City city1=new City();
        city1.setCityName("Bangalore");
        city1.setArea(12000);
        city1.setStateName("Karnataka");
        city1.setLanguage("Kannada");
        city1.setCountryName("India");
        city1.setCapital("New Delhi");
        
        System.out.println(city1);
	}

}
