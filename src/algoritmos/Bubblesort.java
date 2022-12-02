package algoritmos;


public class Quicksort {

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

	private static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i ++){
            for(int j = 0; j < arr.length - 1  ;j++){
                if(arr[j] > arr[j+1]){
                    int swap = arr[j];        // place the bigger number to swap
                    arr[j] = arr[j+1];    // place the smaller number
                    arr[j+1] = swap;
                }
            }
        }
	}
}
