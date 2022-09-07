package dat100;


import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {

		int innTxt = Integer.parseInt(showInputDialog("skriv inn brutto lønn"));

		int lønn0 = (190350);
		int lønn1 = (267899);
		int lønn2 = (643799);
		int lønn3 = (969199);
		int lønn4 = (1999999);
		int lønn5 = (2000000);

		//skatt i prosent
		double t1 = 0.017; // 190 350 – 267 899
		double t2 = 0.04; // 267 900 – 643 799
		double t3 = 0.134; // 643 800 – 969 199
		double t4 = 0.164; // 969 200 – 1 999 999
		double t5 = 0.174; // >2 000 000
		
		if (innTxt<lønn0) {
			System.out.println("Du slipper å betale skatt");
		}
		if (innTxt<lønn1&&innTxt>lønn0) {
			System.out.println("din skatt er " + innTxt*t1);
		}
		if (innTxt<=lønn2&&innTxt>lønn1) {
			System.out.println("din skatt er " + innTxt*t2);
		}
		if (innTxt<=lønn3&&innTxt>lønn2) {
			System.out.println("din skatt er " + innTxt*t3);
		}
		if (innTxt<=lønn4&&innTxt>lønn3) {
			System.out.println("din skatt er " + innTxt*t4);
		}
		if (innTxt>=lønn5) {
			System.out.println("din skatt er " + innTxt*t5); 
		}
	}
}

