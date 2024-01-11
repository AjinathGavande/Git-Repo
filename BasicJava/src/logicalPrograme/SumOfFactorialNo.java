package logicalPrograme;

public class SumOfFactorialNo 
{
	public static void main(String[] args) 
	{
		int a= 15 ;
		int b=0;
		for (int i=1;i<a;i++)
		{
			if (a%i==0)
			{
				b=b+i;
			}
		}
		
		System.out.println("Addition of all Factors of :" +a+" = "+b);
	}

}
