package dat100;
import static javax.swing.JOptionPane.*;
public class O3 {

	public static void main(String[] args) {

		int heltall = Integer.parseInt(showInputDialog("Skriv inn et heltall større enn null"));
		int fakultet=heltall;
		System.out.print(heltall + "! = "); 
		
		int x =1 ;
		
		for (int i = 1; i<heltall; i++) {
		
			System.out.print(i + "*");
			
			
			fakultet = fakultet*i;
			
		}
		System.out.println(fakultet);
		
	
		
		
	
		
	}

}
