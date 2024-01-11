package logicalPrograme;

public class ReverseString 
{
	
	public static void main(String[] args) 
	{
		String s1 = "Welcome in java";
		
		String[] s2 = s1.split(" ");
			for(String s3:s2)
			{
			String s4= "";
			
				for(int i=s3.length()-1;i>=0;i--)
				{
					s4 = s4 +s3.charAt(i);
				
				}
				System.out.print(s4+" ");
		}

	
		
	}

}
