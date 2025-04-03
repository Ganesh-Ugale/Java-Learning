/*
1. It is a Driver Class.
2. Inside the Driver class we create an Objects.
3. Objects are created at Run-Time.
4. main() Method is also executes at Run-Time so we need to create z
   an Objects inside the main() method Only.
5. An Object is a Block of Memory.
*/

class ChairDriver{

	public static void main(String[] args) {  // main() Method

		// Creating an Object
		Chair ch = new Chair(); /* #Chair# is a non-primitive data type, #ch# is a non-primitive variable,  #new# is a keyword that helps in allocate a memory inside the heap are for object, and #Chair()# is a constructor that loads the all specifications of objects from the blueprint class inside the block of memory.*/

		System.out.println(ch);  // Prints the referace or address of memory.
	}
}