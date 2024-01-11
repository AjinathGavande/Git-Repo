package logicalPrograme;

public class PrimeNo 
{
	public static void main(String[] args) 
	{
		int a=7;
		int temp =0;
		
		for (int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				temp = temp+1;
			
			}
		}
		if(temp==0)
		{
			System.out.println(a +" is a prime no");
		}
		else
		{
			System.out.println(a +" is not prime no");
		}
	}

}
