package algoritmos;

import java.io.IOException;

public class Quicksort {

	public static void main(String[] args) throws IOException {
		int quantidade = 10000;
		int[] vetor = new int[quantidade];

		System.out.println("Vetor desordenado: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * quantidade);
			System.out.print(i + " ");
		}
		quickSort(vetor, 0, vetor.length - 1);
		System.out.println("\nVetor ordenado: ");
		for (int i : vetor) {
			System.out.print(i + " ");
		}
	}

	private static void quickSort(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = posicaoPivor(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivo - 1);
			quickSort(vetor, posicaoPivo + 1, fim);
		}
	}

	private static int posicaoPivor(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int i = inicio + 1; 
		int f = fim;
		while (i <= f) {
			if (vetor[i] <= pivo)
				i++;
			else if (pivo < vetor[f])
				f--;
			else {
				int troca = vetor[i];
				vetor[i] = vetor[f];
				vetor[f] = troca;
				i++;
				f--;
			}
		}
		vetor[inicio] = vetor[f];
		vetor[f] = pivo;
		return f;
	}
}
