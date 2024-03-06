package projeler;



public class proje2 {
	
	
		public static int  birincideOlan(int a[], int b[])
								
		{ 
			int condition=0;
			for (int i = 0; i < a.length; i++) 
			{ 
				int j; 
				
				for (j = 0; j < b.length; j++) 
				{	
					if (a[i] == b[j]) { 
					  break; 
				}
			}

				if (j == b.length) 
				
			condition=a[i];
			} 
		
	     return condition;
		} 

		
		public static void main(String[] args) 
		{ 
	
//	          int[] a=new int[50];
//	          int[] b=new int[50];
	          
			int[] a= {1,2,3,4,5};
	        int[] b= {2,3,1,0,5};
	          
	    

			System.out.print("1.de olan 2.de olmayan sayı: " +birincideOlan(a,b));
		} 

} 
