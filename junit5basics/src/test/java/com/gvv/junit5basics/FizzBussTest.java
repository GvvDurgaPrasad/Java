package com.gvv.junit5basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBussTest {

	@Test
	@DisplayName("should display fizz if number is divisible by 3")
	public void testForFizz() {
		
		FizzBuzz fizz = new  FizzBuzz();
		int number = 9;
		
		assertEquals("Fizz",fizz.play(number));
	}
	
	@Test
	@DisplayName("should display Buzz if number is divisible by 5")
	public void testForBuzz() {
		
		FizzBuzz buzz = new  FizzBuzz();
		int number = 30;
		
		assertEquals("Fizz",buzz.play(number));
	}
	
	@Test
	@DisplayName("should display FizzBuzz if number is divisible by 5")
	public void testForFizzBuzz() {
		
		FizzBuzz fizzbuzz = new  FizzBuzz();
		int number = 15;
		
		assertEquals("Fizz",fizzbuzz.play(number));
	}
}
