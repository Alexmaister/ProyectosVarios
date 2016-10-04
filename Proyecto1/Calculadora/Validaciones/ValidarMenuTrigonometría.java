package Validaciones;

import java.util.Scanner;

public class ValidarMenuTrigonometría {
	
	/*CABEZERA:int validarMenuTrigonometria()
	 * Descripcion:Metodo que valida la opcin elegida del menu de trigonometria
	 * Entradas:Ninguna
	 * Salidas:La opcion elegida del menu
	 * Precondiciones:El menu de trigonometria tendra 7 opciones
	 * Postcondiciones:Se devolvera la opcion elegida del menu
	 * */
	public static int validarMenuTrigonometria(){
		
		int opcionT=0;
		
		//abrimos el flujo de teclado
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Elija una opción");
		
		//hacer mientras la opcion elegida no este en el menu
		do{
			
			//leemos de teclado
			opcionT=teclado.nextInt();
			
			//si la opcion no esta en el menu
			if(opcionT<0||opcionT>6){
				
				//mostrar mensaje
				System.out.println("Elija una opcion contenida en el menu");
			};
			
		}while(opcionT<0||opcionT>7);
		
		//cerramos el flujo de teclado
		//teclado.close();
		
		return opcionT;
	}

}
