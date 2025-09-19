package abtractmodifier;

/*
 * This is Linux Implementation Class which uses the HP Printer for take the
   prints but they implement there own implementation but using the same signature
   that printer gives i.e features.
   This is a Service Providers
 * */

public class LinuxImp extends HpPrinter{
	String name = "hello";
	public LinuxImp() {     
	
	}
	
	@Override
		public void print() {
			System.out.println("Print From Linux!");			
		}	
}
