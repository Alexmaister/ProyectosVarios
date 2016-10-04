package Validaciones;

import java.util.*;

public class ValidarMenuPrincipal {

	
	/*CABEZERA: int validarMenuP()
	 * Descripcion:Valida la opcion del menu proincipal,
	 * Entradas:Ninguna
	 * Salidas:Opcion
	 * Precondiciones:El menu solo tiene las ocpiones 0,1 y 2
	 * Postcondiciones:La opcion devuelta sera 0,1,2
	 * */
	public static int validarMenuP(){
		
		//abrimos flujo del teclado
		Scanner teclado=new Scanner(System.in);
		int opcion=0;
		
		System.out.println("Escoja una opción");
		
		//hacer mientras la opcion no este entre las disponibles 
		do{
		
		
		//recogemos la opcion elegida
		opcion=teclado.nextInt();
		
		//si la opcion no se encuentra en el menu mostrar nuevo mensage
		if(opcion<1 || opcion>2){
			
			System.out.println("Elija una opcion correcta");
		}
		
		}while(opcion<1 || opcion>2);
		
		//cerramos flujo del teclado
		teclado.close();
		
		return opcion;
	}
}
