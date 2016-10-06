package MenusYValidaciones;

import java.util.Scanner;

public class MostraryValidarMenuPrincipal {
	
	/*CABEZERA:int menuPrincipal()
	 * Descripcion:Metodo que muestra por pantalla el menu principal y valida la opcion 
	 * Entradas:Lee opcion de teclado	
	 * Salidas:Muestra el menu en pantalla y devuelve la opcion elegida
	 * Precondiciones:(Ninguna porque no lo estamos controlando aun)La opcion debe ser un entero entre 0 y2 
	 * Postcondiciones:Ser veran en pantalla 2 opciones y devolvera la opcion elegida
	 * */
		
	public static  int menuPrincipal(){
		
		System.out.println("MENU DE CALCULADORA CIENTIFICA");
		System.out.println("------------------------------");
		System.out.println("1--OPERACIONES ARITMÉTICAS");
		System.out.println("2--OPERACIONES TRIGONOMÉTRICAS");
		System.out.println("\n0--SALIR");
		
				//abrimos flujo del teclado
				Scanner teclado=new Scanner(System.in);
				int opcion=0;
				
				System.out.println("Escoja una opción");
				
				//hacer mientras la opcion no este entre las disponibles 
				do{
				
				
				//recogemos la opcion elegida
				opcion=teclado.nextInt();
				
				//si la opcion no se encuentra en el menu mostrar nuevo mensage
				if(opcion<0 || opcion>2){
					
					System.out.println("Elija una opcion correcta");
				}
				
				}while(opcion<0 || opcion>2);
				
				
				
				return opcion;
		
		
		
	}
}
