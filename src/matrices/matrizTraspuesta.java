package matrices;

public class matrizTraspuesta {

	public static void main(String[] args) {
		int [][] matriz = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		int filas = matriz.length;
		int columnas = matriz[0].length;
		
		int [][] matrizT = new int [columnas][filas];
		//int [][] matrizT = new [matriz[0].length][matriz.length];
		
		System.out.println ("Matriz Original: ");
		for (int i=0; i < filas; i++) {
			for (int j=0;j<columnas; j++) {
				System.out.print(matriz[i][j] + " ");
		}		
			System.out.println();
		}
		System.out.println("\nMatriz Traspuesta: ");
		for (int i=0; i < columnas; i++) {
			for (int j=0;j<filas; j++) {
			System.out.print(matriz[j][i] + " ");
		}
			System.out.println();
	}
		//Cargar matrizT con los valores traspuestos
		
		for (int i=0; i<matrizT.length; i++) {
			for (int j=0; j<matrizT[0].length; j++) {
				matrizT[i][j] = matriz [j][i];
							}
			System.out.println();
		}
		
		//Visualizar matriz traspuesta
		System.out.println("Matriz traspuesta");
		for (int i=0; i<matrizT.length; i++) {
			for (int j=0; j<matrizT[0].length; j++) {
				System.out.print(matrizT [i][j] + " ");
			}
			System.out.println();		
}
	}
}

