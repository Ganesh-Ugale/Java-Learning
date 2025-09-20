package abtractmodifier;

/*
 * This is Windows Implementation Class which uses the HP Printer for take the
   prints but they implement there own implementation but using the same signature
   that printer gives i.e features.
   This is a Service Providers
 * */
public class WindowsImp extends HpPrinter{
	
	public WindowsImp() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void print() {
		System.out.println("Print From Windows!");
		
	}
}
