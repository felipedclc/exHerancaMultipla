package devices;

public class ConcretPrinter extends Device implements Printer {

	public ConcretPrinter(String serialNumber) {
		super(serialNumber);
		
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Printing process: " + doc);
	}

	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}
	
}
