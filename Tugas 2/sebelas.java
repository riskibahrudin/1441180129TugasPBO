class sebelas{
	public static void main(String[] args) {
		int panjang = 20;
		int lebar = 8;

		for (int a=1;a<=panjang ;a++ ) {
			if (a%2==0) 
			{
				System.out.print(" ");	
			}
			for (int b=1;b<=lebar ;b++ ) {
				System.out.print("#");
			}
				System.out.println(" ");
		}
	}
}