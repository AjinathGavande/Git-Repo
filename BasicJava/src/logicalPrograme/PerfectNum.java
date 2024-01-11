package logicalPrograme;

public class PerfectNum 
{
	public static void main(String[] args) 
	{
		int a= 497;
		int b=0;
		for (int i=1;i<a;i++)
		{
			if(a%i==0)
			{
				b=b+i;
			}
		}
		if(b==a)
		{
			System.out.println(a+ " is a perfect number.");
		}
		else
		{
			System.out.println(a+ " is not a perfect number.");
		}
	}
	
	
	

}
