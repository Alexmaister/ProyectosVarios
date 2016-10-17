package MenusYValidaciones;

import java.util.Scanner;

public class MostraryValidarMenuPrincipal {
	
	/*CABEZERA:int mostraryValidarMenuPrincipal()
	 * Descripcion:Metodo que muestra por pantalla el menu principal y valida la opcion 
	 * Entradas:Lee opcion de teclado	
	 * Salidas:Muestra el menu en pantalla y devuelve la opcion elegida
	 * Precondiciones:(Ninguna porque no lo estamos controlando aun)La opcion debe ser un entero entre 0 y2 
	 * Postcondiciones:Ser veran en pantalla 2 opciones y devolvera la opcion elegida
	 * */
		
	public static int mostraryValidarMenuPrincipal(){
		
		System.out.println("MENU DE CALCULADORA CIENTIFICA");
		System.out.println("------------------------------");
		System.out.println("1--OPERACIONES ARITMETICAS");
		System.out.println("2--OPERACIONES TRIGONOMETRICAS");
		System.out.println("3--OPERACIONES LEY DE OHM");
		System.out.println("\n0--SALIR");
		
				//abrimos flujo del teclado
				@SuppressWarnings("resource")
				Scanner teclado=new Scanner(System.in);
				int opcion=0;
				
				System.out.println("Escoja una opcion");
				
				//hacer mientras la opcion no este entre las disponibles 
				do{
				
				
				//recogemos la opcion elegida
				opcion=teclado.nextInt();
				
				//si la opcion no se encuentra en el menu mostrar nuevo mensage
				if(opcion<0 || opcion>3){
					
					System.out.println("Elija una opcion correcta");
				}
				
				}while(opcion<0 || opcion>3);
				
				if(opcion==0){
					System.out.println("Gracias por confiar en nosotros");
					System.out.println("<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3");
				}
				
				return opcion;	
	}
}
