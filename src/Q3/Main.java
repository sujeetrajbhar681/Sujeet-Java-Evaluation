package Q3;

import Q3.Axis;
import Q3.Bank;
import Q3.Icic;
import Q3.Sbi;

class Bank{
	public double getRateOfInterst(){
		return 0;
	}
}

class Sbi extends Bank{
	@Override
	public double getRateOfInterst() {
		return 3.0;
	}
}

class Axis extends Bank{
	@Override
	public double getRateOfInterst() {
		return 6.50;
	}
}

class Icic extends Bank{
	@Override
	public double getRateOfInterst() {
		return 6.5;
	}
}

public class Main {
	public static void main(String[] args) {
		Bank bank;
		bank = new Sbi();
		System.out.println(bank.getRateOfInterst());
		
		bank = new Axis();
		System.out.println(bank.getRateOfInterst());
		
		bank  = new  Icic();
		System.out.println(bank.getRateOfInterst());
	}
}