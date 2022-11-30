package algoritmos;

public class SelectionSortExample {  
       
    public static void main(String a[]){  
    	int quantidade = 10000;
		int[] arr1 = new int[quantidade];
    	
        System.out.println("Before Selection Sort");  
        for (int i = 0; i < arr1.length; i++) {
        	arr1[i] = (int) (Math.random() * quantidade);
        	System.out.print(arr1[i]+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");  
        }  
    }  
    
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
}  
