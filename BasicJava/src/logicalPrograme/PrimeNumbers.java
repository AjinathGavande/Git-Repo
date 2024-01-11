package logicalPrograme;

public class PrimeNumbers
{
	public static void main(String[] args) 
	{
		for(int no= 100;no<=1000;no++)
		{
			int temp =0;
			for (int i=2;i<no;i++)
			{
				if(no%i==0)
				{
					temp = temp +1;
				}
			}
			if (temp==0)
			{
				System.out.println(no);
			}
		}
	
		
	}

}
