package exemplos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(10);
		readFile("");
		validarString("omnilink");
	}

	public static long f(int n) {
        int x;
		if (n < 2) {
            return n;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
	
	public static String readFile(String fileName){ 
	    BufferedReader br; 
	    try { 
	        br = new BufferedReader(new FileReader(fileName)); 
	        final StringBuilder sb = new StringBuilder(); 
	        String line = br.readLine(); 
	 
	        while (line != null) { 
	            sb.append(line); 
	            sb.append(System.lineSeparator()); 
	            line = br.readLine(); 
	        } 
	        br.close(); 
	        return sb.toString(); 
	    } catch (IOException e) { 
	        e.printStackTrace(); 
	    } 
	    return ""; 
	}
	
	public static boolean validarString(String entrada) {
		if (entrada != null && !entrada.equals("") && entrada.length() > 3) {
			return true;
		} else {
			return false;
		}
	}
}
