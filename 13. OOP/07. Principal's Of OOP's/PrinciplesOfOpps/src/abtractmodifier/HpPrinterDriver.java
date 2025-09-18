package abtractmodifier;

/*
 * This is a Service User Class that Printer Service uses the Users of Windows OR
   Linux Systems.
 * */

public class HpPrinterDriver {
	
	public static void main(String[] args) {
		
		HpPrinter h1 = new LinuxImp(); // Up casting done
		
		h1.print(); // Prints from Windows bcz user is work on windows system
		
		/*
		 * At Compile time the compiler does the binding with the HpPrinter 
		   Class method, but at run time JVM does the binding which object 
		   is created. So here We Achieve the Gendralization.
		   
		 * */
	}
}
