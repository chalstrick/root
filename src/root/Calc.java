package root;

import root.calculations.Times4;

public class Calc {
	public static void main(String[] args) {
		System.out.println("Math:");
		System.out.println("PI: "+Math.PI);
		System.out.println("4*PI: "+Times4.times4(Math.PI));
	}
}
