package it.array;

public class EsempiMatrici {

	public static void main(String[] args) {
	
		//Crea una matrice 2x3 e stampa tutti i suoi elementi.
		
        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6}
            };

            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice[i].length; j++) {
                    System.out.print(matrice[i][j] + " ");
                }
                System.out.println();
            }

		
		     System.out.println("--------------");
		     
		     // Somma tutti gli elementi di una matrice 3x3.
		     
		     
		        int[][] mat = {
		                {1, 2, 3},
		                {4, 5, 6},
		                {7, 8, 9}
		            };
		            int somma = 0;

		            for (int i = 0; i < mat.length; i++) {
		                for (int j = 0; j < mat[i].length; j++) {
		                    somma += mat[i][j];
		                }
		            }

		            System.out.println("Somma: " + somma);

		     

	}

}
