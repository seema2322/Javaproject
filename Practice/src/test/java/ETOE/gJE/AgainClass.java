package ETOE.gJE;

import org.testng.annotations.Test;

public class AgainClass implements AginInterface  {

	@Override
	public void testmethod1() {
		// TODO Auto-generated method stub
		System.out.println("This is output for methos1");
	}

	@Override
	public void testmethod2() {
		// TODO Auto-generated method stub
		System.out.println("This is output for methos2");
	}

	@Override
	public void testmethod3() {
		// TODO Auto-generated method stub
		System.out.println("This is output for methos3");
	}
	
	@Test
	public void mainmehod() {
		
		AginInterface a=new AgainClass();
		a.testmethod1();
		a.testmethod2();
		a.testmethod3();
	}

}
