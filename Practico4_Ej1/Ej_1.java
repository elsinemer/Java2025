import java.util.Random;

public class Ej_1 {
	  public static void main(String[] args) {
	        Random random = new Random();

	        // Generar dos números enteros al azar entre 1 y 100
	        int a = random.nextInt(100) + 1;  // valores entre 1 y 100
	        int b = random.nextInt(101);      // valores entre 0 y 100

	        // Mostrar los valores generados
	        System.out.println("Valor de a: " + a);
	        System.out.println("Valor de b: " + b);

	        // Verificar que b sea distinto de 0
	        if (b != 0) {
	            int cociente = a / b;
	            int resto = a % b;

	            System.out.println("Cociente (a / b) = " + cociente);
	            System.out.println("Resto (a % b) = " + resto);
	        } else {
	            System.out.println("Error: sepuede dividir entre cero.");
	        }
	    }
	}

