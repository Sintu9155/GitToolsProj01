package com.nt.main;


public class App {
	
	public static  int sum(int n1,int n2)
	{
		return n1+n2;
		
	}
    public static void main(String[] args) {

      App app=new App();
      int sum = App.sum(1, 2);
      System.out.println("Sum : "+sum);
    }
}
