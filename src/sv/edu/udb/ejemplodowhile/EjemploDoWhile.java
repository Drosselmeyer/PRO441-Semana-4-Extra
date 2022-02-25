package sv.edu.udb.ejemplodowhile;
import javax.swing.*;
public class EjemploDoWhile {
	public static void main(String[] args) {
		//Declaramos variables para calcular la serie
		int numInicial=0;
		int aumento=0;
		
		//Declaramos variables para saber la posición donde se detendra
		int posicion=0;
		
		//Declaramos un contador/bandera
		int bandera=1;
		
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
		
		while(bandera < posicion){
			
			numInicial = numInicial + aumento;
			System.out.println(numInicial);
			
			bandera++;
		}
		
		JOptionPane.showMessageDialog(null,
				"El número en la posición "+ posicion+ " es: "+numInicial);
	}
}
