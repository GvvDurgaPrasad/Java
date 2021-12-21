package com.gvv.junit5basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DataTypesTest {
	
	@Test
	@DisplayName("should display fit if -150 short")
	public void TestForDataType() {
		
		DataTypes datatypes = new DataTypes();
		int number = -150;
		
		assertEquals("short",datatypes.play(number));
	}
	
	@Test
	@DisplayName("should display fits if 150000 is int")
	public void TestForDatatype() {
		
		DataTypes datatypes = new DataTypes();
		int number = 150000;
		
		assertEquals("int",datatypes.play(number));
	}
	
	@Test
	@DisplayName("should display fitted if 1500000000 is long")
	public void TestForDataTypes() {
		
		DataTypes datatypes = new DataTypes();
		int number = 1500000000;
		
		assertEquals("long",datatypes.play(number));
	}

	@Test
	@DisplayName("should display cannot fitted if 233333333333333333333333333333 is fitted")
	public void TestForDatatypes() {
		
		DataTypes datatypes = new DataTypes();
		long number = 233333333;
		
		assertEquals("cannot Fitted",datatypes.play(number));
	}
}
