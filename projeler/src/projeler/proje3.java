

package projeler;



public class proje3 {



	
		public static void NonRepeating(String cumle)
	      {
		  
		  int j=0;
		  int i=0;
	      char harf;
            
	         for(i=0;i<cumle.length();i++)
	         {
            
	             for ( j = 1; j < cumle.length(); j++)
	             {
	             
	                if(cumle.charAt(i)==cumle.charAt(j) && j!=i) {
	                	
	                	harf=cumle.charAt(j);
	                	
	             System.out.print(harf);
	            
	                }
	             
	                
	             
	             }
	             
	         
	        
	         }
	      
	      }

	       public static void main(String[] args) 
	       {
	    
	    
	        
	   NonRepeating("kaan");
	      
	         
	       }

	
}
	

