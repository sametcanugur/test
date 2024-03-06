package projeler;

import java.util.Scanner;

class deneme
{
	
	public static void matching(int[] array, int number)
	{
		
		for (int i = 0; i < array.length; i++)
		{
			
			for (int j = i + 1; j < array.length; j++)
			{
				
				if (array[i] + array[j] == number)
				{
					System.out.println(number);
					return;
				}
			}
	
	    }

		System.out.println("No");	
	}
		
	

	public static void main (String[] args)
	{
	
		int[] array = {6,2,3,4};
		int number = 4;
	    
		
		matching(array,number);
	
    }
}