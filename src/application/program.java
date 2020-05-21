package application;

import devices.ComboDevice;
import devices.ConcretPrinter;
import devices.ConcretScanner;

public class program {

	public static void main(String[] args) {
		
		ConcretPrinter p1 = new ConcretPrinter("1008");
		p1.processDoc("My letter");
		p1.print("My letter");
		
		System.out.println();
		ConcretScanner s1 = new ConcretScanner("1181");
		s1.processDoc("My email");
		System.out.println("Scan result: " + s1.scan());
		
		ComboDevice c1 = new ComboDevice("2314");
		c1.processDoc("My dissertation");
		c1.print("My dissertation");
		System.out.println("Scan result: " + c1.scan());
		
		
	}

}
