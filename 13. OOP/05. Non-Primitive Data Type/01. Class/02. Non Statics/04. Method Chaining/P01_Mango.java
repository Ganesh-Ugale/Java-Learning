/*
1. Here if we want to return a ref so we need to save it in a non-primitive data type,
   bcz ref is a non-primitive data and that can be stored in the non primitive data type,
   so we stored in a className bcz every class name is a userdfined non-primitive data type.
 2. Here P01_Mango is a Non Primitive Data Type so while method Execution Done so Method 
 	returns the ref of current object in this keyword.
*/

class P01_Mango{
	double price;
	String type;
	String origine;


	public P01_Mango printPrice(){
		System.out.println("Price : " + price);
		// System.out.println(this);
		return this; // returns the current runnning object ref
	}

	public P01_Mango printType(){
		System.out.println("Type : " + type);
		return this;
	}

	public P01_Mango printOrigine(){
		System.out.println("Origine : " + origine);
		return this;
	}
}