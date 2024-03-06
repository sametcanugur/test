package projeler;
import java.util.Scanner;

public class dene {


	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string : ");
 
        String original = scanner.nextLine();
        
 
        String words[] = original.split("\\s");
        String reversedString = "";
 
        
        for (int i = 0; i < words.length; i++) { 
            if (i == words.length - 1) 
                reversedString = words[i] + reversedString; 
//            else
//                reversedString = " " + words[i] + reversedString; 
        } 
 
      
        System.out.print("Reversed string : " + reversedString);
    }
}


// se la 
//               i 0   s
//               i 1  es
//               i 2   es
//               1 3    l es      i4   

//               