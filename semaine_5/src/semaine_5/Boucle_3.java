package semaine_5;

import javax.swing.JOptionPane;

public class Boucle_3 {
	public static void main(String[] args) {
		int iMax;
		int iNombre;
		int iPetit;
		int i;
		boolean bool;
		
		iMax = Integer.parseInt(JOptionPane.showInputDialog("Nombre de nombre:"));
		for(i = 1, iPetit = 0, bool = true; i <= iMax; i++ ) {
			iNombre = Integer.parseInt(JOptionPane.showInputDialog("Nombre #"+i+":"));
			
			if(bool == true) {
				bool = false;
				iPetit = iNombre;
			} else if(iNombre <= iPetit)
				iPetit = iNombre;
		}
		JOptionPane.showMessageDialog(null, "Le nombre le plus petit est "+iPetit);
	}
}
