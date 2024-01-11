package logicalPrograme;

public class PerfectNo 
{
	public static void main(String[] args) 
	{
		int num,  sum=0;
		
		
		for (num=1;num<1000;num++)
		{
			for(int j=1;j<=num;j++)
			{
				if(num%j==0)
				{
					sum=sum+j;
					
				}
			}
			if(sum==num)
			{
				System.out.println(sum+" is a Perfect no");
			}
			
		}
		
		
	}
	

}
