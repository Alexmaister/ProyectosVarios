package MenusYValidaciones;

import java.util.Scanner;

public class MostraryValidarMenuAritmetica {
	
	
	/*CABEZERA:int mostraryValidarMenuAritmetica()
	 * Descripcion:Metodo que muestra por pantalla el menu de operaciones aritmeticas y devuelve la opcion elegida
	 * Entradas:Opcion elegida del menu	
	 * Salidas:Muestra el menu en pantalla y devuleve la opcion elegida
	 * Precondiciones:Ninguna
	 * Postcondiciones:Ser veran en pantalla 8 opciones y devolvera la opcion elegida
	 * */
	public static int mostraryValidarMenuAritmetica(){
		
		System.out.println("\n0--VOLVER");
		System.out.println("1--SUMAR");
		System.out.println("2--RESTAR");
		System.out.println("3--MULTIPLICAR");
		System.out.println("4--DIVIDIR");
		System.out.println("5--RAIZ");
		System.out.println("6--POTENCIA");
		System.out.println("7--SUMATORIO");
		
				//abrimos el flujo de teclado
				Scanner teclado=new Scanner(System.in);
				int opcionA=0;
				
				System.out.println("Elija una opci�n");
				
				//hacer mientras la opcion elegida no este en el menu
				do{
					
					//leemos de teclado
					opcionA=teclado.nextInt();
					
					//si la opcion no esta en el menu
					if(opcionA<0||opcionA>7){
						
						//mostrar mensaje
						System.out.println("Elija una opcion contenida en el menu");
					};
					
				}while(opcionA<0||opcionA>7);
				
			
				
				return opcionA;
	
	}

}
