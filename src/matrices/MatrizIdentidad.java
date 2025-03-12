package matrices;

public class MatrizIdentidad {

	public static void main(String[] args) {
		int[][] matriz = new int [4][4];
		
		int filas = matriz.length;
		int columnas = matriz[0].length;
		System.out.println("Nº filas: " + filas);
		System.out.println("Nº columnas: " + columnas);
		
		for (int i=0; i<filas; i++) {
			for (int j=0; j<columnas; j++) {
				if (i==j) matriz[i][j] = 1;
				else matriz [i][j] = 0;
			}//for
		}//for
		for (int i=0; i<filas; i++) {
			for (int j=0; j<columnas; j++) {
				System.out.print(matriz[i][j] + "   ");
			}
			System.out.println();
		}
		
	}//main

}//MatrizIdentidad
