class P02_Practice1{

	public static void main(String[] args) {
		hello(); // Here we this method calls the method
	}
	// METHODS
	public static void hello(){
		for (int i = 1; i<=5 ; i++) {
			if (i==3) {
				return;
			}
			System.out.println(i);
		}
		System.out.println("Over");
	}
}