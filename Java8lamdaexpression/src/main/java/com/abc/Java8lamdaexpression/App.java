package com.abc.Java8lamdaexpression;
import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;


public class App 
{
    private static final int String = 0;
	private static final int List = 0;
	//private static final boolean list = false;
	//private static boolean list;

	public static void main( String[] args)
	{
		public List<String> search(List<String> list){
        	return list.stream()
        .filter(s ->s.startsWith("a"))
        		.filter(s ->s.length() == 3)
        			.collect(Collectors.toList());}
        			
         
	}
    }

