package com.gvv.junit5basics;

public class DataTypes {

	public String play(long number) {
		
		int x = 0;
		if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE){
            return "byte";
        }
        if (x>=Short.MIN_VALUE && x<=Short.MAX_VALUE){
            return "short";
        }
        if (x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE){
            return " int";
        }
        if (x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){
            return "long";
        }
        
        return "";
	}
}

	

