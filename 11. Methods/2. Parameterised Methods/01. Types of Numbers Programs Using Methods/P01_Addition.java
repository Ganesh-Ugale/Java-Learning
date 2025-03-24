// Parameterised Methods Example of Addition of Num

class P01_Addition{
	public static void main(String[] args) {
		add(2, 5);
		add(50, 4/2);
		add(200, 400);
	}
	// Methods Definition
	public static void add(int a, int b){
		int op = a + b;
		System.out.println("Addition : " + op);
	}
}