class sembilan{
	public static void main(String[] args) {
		int a = 110;
		for (int b=1;b<a ;b++ ) {
			if (b%5==0) 
			{
				b++;
				System.out.print("JONI");	
			}
				System.out.print(b+" ");
				if (b%11==0) 
			{
				System.out.println(" ");	
			}
		}
	}
}