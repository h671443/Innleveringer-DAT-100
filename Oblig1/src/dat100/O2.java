package dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			String innTxt = showInputDialog("skriv sum fra 0-100 ");
			int sum = Integer.parseInt(innTxt);
			System.out.print("elev " + i + ": ");
			{
				if (sum<0 || sum>100) {
					System.out.println("prøv igjen" + i--);
					
				}
				if (sum <= 100 && sum >= 90) {
					System.out.println("A");
				}
				if (sum <= 89 && sum >= 80) {
					System.out.println("B");
				}
				if (sum <= 79 && sum >= 60) {
					System.out.println("C");
				}
				if (sum <= 59 && sum >= 50) {
					System.out.println("D");
				}
				if (sum <= 49 && sum >= 40) {
					System.out.println("E");
				}
				if (sum <= 39 && sum >= 0) {
					System.out.println("F");

				}

			}
		}
	}
}

