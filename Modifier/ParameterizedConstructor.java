 class Addition{
	int num1 ;
	int num2;
	public Addition(int a, int b){
		num1 = a;
		num2 = b;
	}
	
	void add() {
		
		System.out.print(num1 + num2);
	}
}
 class ParameterizedConstructor {

	public static void main(String[] args) {
	Addition addition = new Addition(5, 8);
	addition.add();
	

	}

}
