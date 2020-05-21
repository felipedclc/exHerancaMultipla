package application;

import devices.Printer;
import devices.Scanner;

public class program {

	public static void main(String[] args) {
		
		Printer p1 = new Printer("1008");
		p1.processDoc("My letter");
		p1.print("My letter");
		
		System.out.println();
		Scanner s1 = new Scanner("1181");
		s1.processDoc("My email");
		System.out.println("Scan result: " + s1.scan());
		
		
		
		
	}

}
