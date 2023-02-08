package examen_parcial_1;
import java.util.Scanner;


public class Main {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			int res_01;
		    String palabra_01;
		    String palabra_02;
		    String palabra_03;
		    String numero_01;
		    String palabra_05;
			
			while(true) {
				System.out.println("Escriba 1 si quiere convertir la primera letra en mayusculas");
				System.out.println("Escriba 2 si quiere invertir una palabra");
				System.out.println("Escriba 3 si quiere convertir las vocales de una palabra o frase en mayusculas");
				System.out.println("Escriba 4 si quiere saber si son multiplos de 3, 5 o ambos");
				System.out.println("Escriba 5 si quiere saber si una palabra es un palindromo");
				System.out.println("Escriba 6 para salir del programa");
				res_01= scan.nextInt();
				
				switch(res_01) {
				
				case 1:
					 
					System.out.println("Ingrese la palabara");
		        	   Scanner scan_1 = new Scanner(System.in);
		        	   palabra_01= scan_1.nextLine();
		        	   String p_01 = palabra_01;
		        	   Examen examen_01 = new Examen(p_01);
		        	   System.out.println("Su palabra es: " + examen_01.primeraMayuscula(p_01));
		        	   System.out.println("");
		        	   break;
		        	   
				case 2:
					 
					System.out.println("Ingrese la palabra");
		        	   Scanner scan_2 = new Scanner(System.in);
		        	   palabra_02= scan_2.nextLine();
		        	   String p_02 = palabra_02;
		        	   Examen examen_02 = new Examen(p_02);
		        	   System.out.println("La palabra invertida es: " + examen_02.invertirCadena(p_02));
		        	   System.out.println("");
		        	   break;
		        	   
				case 3:
					
					System.out.println("Cual es la palabra?");
		        	   Scanner scan_3 = new Scanner(System.in);
		        	   palabra_03= scan_3.nextLine();
		        	   String p_03 = palabra_03;
		        	   Examen examen_03 = new Examen(p_03);
		        	   System.out.println("Su palabra es: " + examen_03.vocalesMayuscula(p_03));
		        	   System.out.println("");
		        	   break;
		        	   
				case 4:
					 
					System.out.println("Ingrese el numero hasta el que desea analizar");
		        	   Scanner scan_4 = new Scanner(System.in);
		        	   numero_01= scan_4.nextLine();
		        	   String n = numero_01;
		        	   int lim = Integer.parseInt(n);
		        	   Examen examen_04 = new Examen(lim);
		        	   System.out.println(examen_04.fizzBuzz(lim));
		        	   System.out.println("");
		        	   break;
		        	   
				case 5:
					 
					System.out.println("Cual es la palabra?");
		        	   Scanner scan_5 = new Scanner(System.in);
		        	   palabra_05= scan_5.nextLine();
		        	   String p_05 = palabra_05;
		        	   Examen examen_05 = new Examen(p_05);
		        	   System.out.println("Palindromo: " + examen_05.palindromo(p_05));
		        	   System.out.println("");
		        	   break;
		        	   
				case 6:
					
					System.out.println("saliendo del programa...");
					System.exit(0);
	     		   
	     		   default:
	     			   System.out.println("Por favor ingrese una opción válida.");
				}
			}


	
	/*public static void main(String[] args) {
		Examen E_1 = new Examen();
		System.out.println(E_1.fizzBuzz());*/

		}}


