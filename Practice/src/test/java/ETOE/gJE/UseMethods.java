package ETOE.gJE;

import org.testng.annotations.Test;

public class UseMethods implements learning  {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("This is output for methos1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("This is output for methos2");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("This is output for methos3");
	}

	
	@Test
	public void  clallingside() {
		method1();
		 method2();
		 method3();
		
		
	}
	
}
