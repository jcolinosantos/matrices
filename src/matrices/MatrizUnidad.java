package matrices;
import java.util.Random;
public class MatrizUnidad {

	public static void main(String[] args) {
		int[][] matriz = new int [4][4];
		
		int filas = matriz.length;
		int columnas = matriz[0].length;
		System.out.println("Nº filas: " + filas);
		System.out.println("Nº columnas: " + columnas);
		Random random = new Random();
		
		for (int i=0; i<filas; i++) {
			for (int j=0; j<columnas; j++) {
				if (i==j) matriz[i][j] = random.nextInt(8) + 1;
				else matriz [i][j] = 0;
			}//for
		}//for
		for (int i=0; i<filas; i++) {
			for (int j=0; j<columnas; j++) {
				System.out.print(matriz[i][j] + "   ");
			} //for
			System.out.println();
		}//for
		
	}//main

}//MatrizUnidad
