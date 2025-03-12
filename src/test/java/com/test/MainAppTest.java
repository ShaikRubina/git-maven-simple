package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.MainApp;

public class MainAppTest {
	/*MainApp map=null;
	
	@Before
	public void before() {
		map=new MainApp();
	}
	 @After 
	 public void after() {
		 map=null;
	 }
	 
	 @Test
	 public void testWithPositive() {
		 assertEquals(14,map.addition(7, 17));
	 }
	 
	 @Test
	 public void testWithNegative() {
		 assertEquals(14,map.addition(-2, -2));
	 }*/
	@Test
	public void testAddition() {
		MainApp map=new MainApp();
		int result =map.addition(8, 6);
		assertEquals(14,result);	}
	 
	 
	 
	 

}
