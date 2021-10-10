public class typecasting {
    public static void main(String []args)
	{
		byte a=20;
		short s=a;
		int i=100000;
		double dbl=i;
		
		System.out.println("Value of byte -: "+a);
		System.out.println("Value of Short -: "+s);
		System.out.println();
		System.out.println("Value of Integer -: "+i);
		System.out.println("Value of Double -: "+dbl);
		
		int l=2305401;
		short srt=(short)l;           
		System.out.println(srt);
		
		double d=88.598;
		int n=(int)d;							
		System.out.println(n);
		
		long lng=95658905284l;
		short k=(short)lng;				
		int z=(int)lng;
		System.out.println(k);
		System.out.println(z);
	}



}

