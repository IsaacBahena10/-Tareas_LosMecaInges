package erciciosCurso;
import java.util.Scanner;
public class Ejercicio2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner(System.in);
			int num1;
			int num2; 
			
			
			
			System.out.println("Escriba el primer numero:");
			num1 = entrada.nextInt();
			
			System.out.println("Escriba el segundo numero:");
			num2 = entrada.nextInt();
	
			
			 if (num1>num2) {System.out.printf("El numero "+num1+" es mas grande" );
			 } 
			 if (num1<num2) {System.out.printf("El numero "+num2+" es mas grande" );
			 } 
			 if (num1==num2) {System.out.printf("Estos numeros son iguales");
			 } 
	}
}
