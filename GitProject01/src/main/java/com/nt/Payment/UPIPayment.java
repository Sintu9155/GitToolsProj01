package com.nt.Payment;

public class UPIPayment {
    public static void doPayment(int id,Double amount)
    {
    	System.out.println("Payment Successfull with Id: "+id+" Amount : "+amount);
    }
	public static void main(String[] args) {

         UPIPayment.doPayment(11,5500.00);

	}

}
