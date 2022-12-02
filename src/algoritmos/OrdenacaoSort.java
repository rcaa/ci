package algoritmos;

import java.util.Arrays;

public class OrdenacaoSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetor = { 5, 9, 7, 4, 6, 1, 2, 3, 10, -1, };

		System.out.println(Arrays.toString(vetor));
		quickSort(vetor, 0, vetor.length - 1);
		System.out.println(Arrays.toString(vetor));

	}

	private static void quickSort(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivo - 1);
			quickSort(vetor, posicaoPivo + 1, fim);

		}
	}

	private static int separar(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int i = inicio + 1;
		int fimTemp = fim;
		while (i <= fimTemp) {
			if (vetor[i] <= pivo)
				i++;
			else if (pivo < vetor[fimTemp])
				fimTemp--;
			else {
				int troca = vetor[i];
				vetor[i] = vetor[fimTemp];
				vetor[fimTemp] = troca;
				i++;
				fimTemp--;
			}
		}
		vetor[inicio] = vetor[fimTemp];
		vetor[fimTemp] = pivo;
		return fimTemp;
	}

}
