package sv.edu.udb.ejemplofor;
import javax.swing.*;

public class EjemploFor {
	public static void main(String[] args) {
		//Declaramos variables para calcular la serie
		int numInicial=0;
		int aumento=0;
		
		//Declaramos variables para saber la posición donde se detendra
		int posicion=0;
		
		numInicial = Integer.parseInt(
				JOptionPane.showInputDialog(null,
						"Ingrese el numero inicial"));
		
		aumento = Integer.parseInt(
				JOptionPane.showInputDialog(null,
						"Ingrese de cuanto en cuanto"
						+ " quiere aumente el numero"));
		
		do{
			posicion = Integer.parseInt(
					JOptionPane.showInputDialog(null,
							"Ingrese la posicion donde quiere que finalice"));
		}while(posicion<=0);
		
		System.out.println(numInicial);
		
		for(int bandera=1; bandera < posicion; bandera = bandera +1) {
					
			numInicial = numInicial + aumento;
			System.out.println(numInicial);
			
		}
		
		JOptionPane.showMessageDialog(null,
				"El número en la posición "+ posicion+ " es: "+numInicial);
	}
}
