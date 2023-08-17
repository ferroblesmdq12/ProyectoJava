package Principal;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
  {
		/**
		 * 
		 * Desafío 1, Crear una rama con el nombre feature/desafio-java-1. 
		 * El objetivo es trabajar la sintaxis de java, if/else y funciones, con validaciones sobre fechas 
		 * 
		 * 1. Ingresar una fecha por teclado: dd/mm/yyyy (dd int, mm int, yyyy int) 
		 * validar que dd >=1 && <=31 TENIENDO EN CUENTA EL MES validar que mes >=1 && <=12 validar que año >=1900 && <= 2099
			
			Nota: Ojo, si el año es bisiesto, febrero tiene 29 días. Informar por consola si la fecha es correcta.
		 */

		System.out.println("Ingrese datos de Fecha (dd/mm/aaaa): \n");
		
		
		Scanner ingresoTeclado = new Scanner(System.in);
		
		System.out.println("Ingrese dia: ");
		int dia = ingresoTeclado.nextInt();
		System.out.println("Ingrese mes: ");
		int mes = ingresoTeclado.nextInt();
		System.out.println("Ingrese Año: ");
		int año = ingresoTeclado.nextInt();
		

			
		
//		System.out.println("dia: " + dia + ",");
//		System.out.println("mes: " + mes + ",");
//		System.out.println("año: " + año );
		
	
		
		/* Otra forma de hacerlo */
		
		// Validacion de años //
		
		if(año>=1900 && año<=2099)
		{
			if(año % 4 == 0 && año % 100 !=0)
			{
				System.out.printf(" %d Es Año biciesto.", año);
				
				if(mes == 2)
				{
					if(dia >=1 && dia<=29)
					{
						System.out.println("Dia correctamente ingresado");
						
						/* Fecha con printf() */
						
						System.out.printf("La fecha es: %d / %d / %d", dia, mes, año);
					}
					else
					{
						System.out.println("Ingresar hasta el dia 29");
					}
				}
				
			}
			else
			{
				
				
				// Validacio de dias //
				
				if(dia>=1 && dia<=31)
				{
					System.out.println("\nDia cargado correctamente.");
				}
				else
				{
					System.out.println("\nDia ingresado fuera de rango!");
				}
				
				
				// Validacion de meses //
				
				if(mes>=1 && mes<=12)
				{
					System.out.println("Mes cargado correctamente.");
				}
				else
				{
					System.out.println("Mes fuera de rango!");
				}	
				
				
				System.out.println("Año Cargado correctamente");
				
				/* Fecha con printf() */
				
				System.out.printf("\n La fecha es: %d / %d / %d", dia, mes, año);
				
			}
			
			
			
		}
		else
		{
			System.out.println("Año Fuera de Rango!");
		}
			
		
		
		
		
		
  }
}
