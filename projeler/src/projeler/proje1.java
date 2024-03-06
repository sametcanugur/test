package projeler;

public class proje1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int count=display("galatasaray",'a');

           System.out.print(count);

	}

	public static int display(String cumle,char harf) {
		
		
		
		int toplamadet=0;
		
		for(int i=0; i<cumle.length();i++) {
		
			if(cumle.charAt(i)==harf) {
				
				toplamadet++;
			}
				
			
				}
		
		
		return toplamadet;
		
		
		
		
	}
	
	
	
	
	
}
