import java.util.Scanner;

public class sumatoria1{

	    public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
	            System.out.println("Ingrese el valor del limite inferior:");
	            int lim1 = scanner.nextInt();

	            System.out.println("Ingrese el valor del limite superior:");
	            int lim2 = scanner.nextInt();

	            int sumatoria = laSumatoria(lim1, lim2);

	            System.out.println("La sumatoria de los cuadrados es: " + sumatoria);
	        }
	    }

	    private static int laSumatoria(int lim1, int lim2) {
	        if (lim1 > lim2) {
	            return 0;
	        } else {
	            int elcuadrado = lim1 * lim1;
	            return elcuadrado + laSumatoria(lim1 + 1, lim2);
	        }
	    }
	}
    