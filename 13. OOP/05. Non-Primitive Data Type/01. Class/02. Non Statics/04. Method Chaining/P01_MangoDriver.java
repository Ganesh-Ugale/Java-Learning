/* 
1. Using Object name as ref we can call any method from object But here we can call n 
   number of method one after another at a one time this is known as a Method Chaining
2. Here the Each time Method Runs and return it's Referance, If the method returns ref  
   then and then only we can call another method from it's ref.
*/

class P01_MangoDriver{
	public static void main(String[] args) {
		
		P01_Mango m1 = new P01_Mango();

		m1.price = 2000d;
		m1.type = "Hapus";
		m1.origine = "Ratnagiri";

		/* Here when m1.printPrice() executes 1st and return the ref So, Using that ref we calling nextMethod same process happns till all method excutes done*/
		m1.printPrice().printType().printOrigine();

		// in following all methods ref are same
		System.out.println("\n\nRetuned Referances Of all Methods");
		System.out.println(m1.printPrice());
		System.out.println(m1.printType());
		System.out.println(m1.printOrigine());
	}
}