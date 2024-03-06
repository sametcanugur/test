package projeler;
import java.util.Scanner;

public class proje4 {

      public static String reversemachine(String original)
      {
	
    	  String words[] = original.split(" ");
          String reversedString="";
   
          
          for (int i = 0; i < words.length; i++) { 
              if (i == words.length - 1) {
                  reversedString = words[i] + reversedString; 
              }
          else  
              {
              	reversedString = " " + words[i] + reversedString; 
              }
              
          } 
   
        
         return reversedString;
      }
  

	
	public static void main(String[] args) {
    

	
		String finalanswer=reversemachine("samet can");

        System.out.print(finalanswer);
	
	   }
	}