package exemplos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(10);
	}

	public static long f(int n) {
        int x;
		if (n < 2) {
            return n;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
}
