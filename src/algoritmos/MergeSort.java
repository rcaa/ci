package algoritmos;

import java.io.IOException;

public class Mergesort {

	public static void main(String[] args) throws IOException {
		int quantidade = 10000;
		int[] vetor = new int[quantidade];

		System.out.println("Vetor desordenado: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * quantidade);
			System.out.print(i + " ");
		}
		mergeSort(vetor, vetor.length);
		System.out.println("\nVetor ordenado: ");
		for (int i : vetor) {
			System.out.print(i + " ");
		}
	}

	private static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

	private static void merge(
      int[] a, int[] l, int[] r, int left, int right) {
     
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
