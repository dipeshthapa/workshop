package com.example.test;

import static org.junit.Assert.*;

import org.junit.Test;
import com.example.classes.*;

public class Testcalc {
 Calculator cal=new Calculator();

	
	
	@Test
	public void testadd(){
		
		assertEquals("10 + 5 must be 15", 20, cal.add(19,1));
				
	}
	
	@Test
	public void testmul(){
		
		assertEquals("10 x 5 must be 50", 50, cal.mul(10,5));
				
	}
	
	@Test
	public void testdiv(){
		
		assertEquals("10 /5 must be 2", 2, cal.div(10,5));
				
	}
	

}
