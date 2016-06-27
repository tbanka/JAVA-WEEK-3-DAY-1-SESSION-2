package com.training;

public class Application {
	
	public static void main(String[] args)
	{
		try{
			new Book(10,"head first java",500.00);
		}
		catch(Exception e)
		{
			System.out.println("Exception cause"+e.getMessage());
			
			e.printStackTrace();
		}
		finally{
			System.out.println("inside Finally block");
		}
		Book bk2=new Book();
		
		bk2.setBookName("Effective java");
		bk2.setBookNumber(11);
		bk2.setPrice(50.00D);
	}

}
