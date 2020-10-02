package com.browser;

public class Sbi extends Rbi {

	@Override
	public void savings(int interest) {
		System.out.println("Savings is 7%:"+interest);
	}

	@Override
	public void fixed(int interest) {
		System.out.println("Fixed is 6%:"+interest);
	}

	public static void main(String[] args) {
		Sbi sbi = new Sbi();
		sbi.fixed(6);
		sbi.savings(7);
	}
}
