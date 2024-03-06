package projeler;

public class proje5 {

     public static void balancer(String arr)
	{
         int sum7=0;
         int sum6=0;
         int sum5=0;
         int sum4=0;
         int sum3=0;
         int sum2=0;
   	     int sum1=0;
    
   	   for(int i=0; i<arr.length();i++) {
     	  
       	
   		  	if(arr.charAt(i)=='(' ) {
       		
       		sum1++;
       		
       	}
       	else if(arr.charAt(i)==')') {
       		  sum2++;
       		  
       	  }
       	else if(arr.charAt(i)=='[') {
       	  sum3++;
       
       	  
       	  }
       	else if(arr.charAt(i)==']') {
	        	  sum4++;
	        	  
	        	  
	        	  }
       	else if(arr.charAt(i)=='{') {
	        	  sum5++;
	        	 
	        	  }
       	else if(arr.charAt(i)=='}') {
	        	  sum6++;
       	   
       	}
   		  
   		  	
    	else {
   	            sum7++;
   
    	 }
   		  	
   		  	
       	}

     	if(sum7!=0) {
	   	   
   		System.out.print("errr");
   	    }

   	   else if(sum1==sum2 &&sum3==sum4 && sum5==sum6) {
       		
       		System.out.print("balanced");
       	}
       	else if(sum1!=sum2 || sum3!=sum4 || sum5!=sum6)
       	{
       		
       		System.out.print("unbalanced");
       	}
       	

	}
	
   
           public static void main(String[] args) 
	       {
	    
	  
	          
    	 balancer(".(");
	     
	   
	        	}

          } 


