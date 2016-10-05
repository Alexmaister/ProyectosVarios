package Validaciones;
import java.util.*;
public class ValidarMenuAritmetica {
	
	/*CABEZERA:int validarMenuA
	 * Descripcion:Metodo para validar el menu de aritm�tica
	 * Entradas:Ninguna
	 * Salidas:Opcion elegida
	 * Precondiciones:El menu de aritmetica tendra 8 opciones
	 * Postcondiciones:Se devolvera la opcion elegida dentro del menu
	 * */
	public static int validarMenuA(){
		
		
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
