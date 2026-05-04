package com.hospital.staff.doctor.salary;

public class Salary {
	protected void  calSal(double amt, double tax) {
		System.out.println(amt);
		System.out.println(tax);
		
	}
public static void main(String[] args) {
		Salary salary = new Salary();
		salary.calSal(56000, 5000);
	}
}
