package com.nt.main;


public class App {
	
	public  int sum(int n1,int n2)
	{
		return n1+n2;
	
	}
    public static void main(String[] args) {

      App app=new App();
      int sum = app.sum(1, 2);

      System.out.println("Sum of both number in dev-1 : "+sum);

      System.out.println("Sum of both number in TL : "+sum);
      
    }
}
