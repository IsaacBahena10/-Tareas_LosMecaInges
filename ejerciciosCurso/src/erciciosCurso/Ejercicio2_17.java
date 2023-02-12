package erciciosCurso;
import java.util.Scanner;
public class Ejercicio2_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int producto; 
		int suma;
		int promedio;
		int operador = 3;
		
		
	
		
		
		System.out.println("Escriba el primer entero:");
		num1 = entrada.nextInt();
		
		System.out.println("Escriba el segundo entero:");
		num2 = entrada.nextInt();
		
		System.out.println("Escriba el segundo entero:");
		num3 = entrada.nextInt();
		
		
		producto = num1*num2*num3;
		suma = num1+num2+num3;
		promedio = (num1+num2+num3)/operador; 
		
		
		System.out.printf("El producto es %d%n", producto);
		System.out.printf("La suma es %d%n",suma);
		System.out.printf("El promedio es %d%n",promedio);
		
		if (num1 >num2 & num1>num3 & num1<num2 & num1<num3) {System.out.printf("El numero "+num1+" es mas grande" );
		 } 
		else if (num1<num2 & num1<num3) {System.out.printf("El numero "+num1+" es el menor y ");
		 } 
		 if (num2>num1 & num2>num3) {System.out.printf("El numero "+num2+" es mas grande" );
		 } 
		 else if (num2<num1 & num2<num3) {System.out.printf("El numero "+num2+" es el menor y ");
		 } 
		 if (num3>num1 & num3>num2) {System.out.printf("El numero "+num3+" es mas grande" );
		 } 
		 else if (num3<num1 & num3<num2) {System.out.printf("El numero "+num3+" es el menor y ");
		 } 
		 if (num1==num2 & num3==num2) {System.out.printf("Estos numeros son iguales");
		 } 
		
		
		 
	}

}
