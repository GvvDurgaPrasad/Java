package com.gvv.junit5basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	@DisplayName("should add numbers")
	public void addtest() {
	MathUtils mathutils = new MathUtils();
	
	assertEquals(3,mathutils.add(1, 2));
	}

	
	//check username format
	
	@Test
	@DisplayName("should return false if empty username")
	void testUserNameEmptyFormat() {
		
		MathUtils mathUtils = new MathUtils();
		assertFalse(mathUtils.checkUserNameFormat(""));
	}
	
	@Test
	@DisplayName("should return false if spaces present in username")
	void testUserNameSpaceFormat() {
		
		MathUtils mathUtils = new MathUtils();
		assertFalse(mathUtils.checkUserNameFormat(""));
	}
	
	@Test
	@DisplayName("should return false if password less than 8 or greater than 12")
	void testPasswordFormat() {
		
		MathUtils mathUtils = new MathUtils();
		assertFalse(mathUtils.checkPasswordFormat("123456"));
	}
}
