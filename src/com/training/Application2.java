package com.training;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=49;
		
		try{
			int den=Integer.parseInt(args[0]);
			System.out.println(den+num);
		}
		catch(Exception e)
		{
			System.err.println("Pass command line argument");
		}
		
	}

}
