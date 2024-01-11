package logicalPrograme;

public class ReverseNo 
{
	
	public static void main(String[] args) 
	{
		int n = 1234567;
		int t;
		int s = 0;
		while (n>0)
		{
			t=n%10;
			s = t+s*10;
			n=n/10;
		}
		System.out.println(s);
		
	}

}
