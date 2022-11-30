package algoritmos;

import java.io.IOException;

public class BubbleSort {

	public static void main(String[] args) throws IOException {

		int quantidade = 10000;
		int[] vetor = new int[quantidade];

		System.out.println("Vetor desordenado: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * quantidade);
			System.out.print(i + " ");
		}

		bubbleSort(vetor);

		System.out.println("\nVetor ordenado: ");
		for (int i : vetor) {
			System.out.print(i + " ");
		}
	}

	private static void bubbleSort(int vetor[]) {
		boolean troca = true;
		int aux;
		while (troca) {
			troca = false;
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetor[i] > vetor[i + 1]) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					troca = true;
				}
			}
		}
	}
}
