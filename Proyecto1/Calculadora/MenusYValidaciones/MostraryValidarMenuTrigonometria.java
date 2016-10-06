package MenusYValidaciones;
import java.util.*;
public class MostraryValidarMenuTrigonometria {
	
	
	/*CABEZERA:int mostraryValidarMenutrigonometria()
	  Descripcion:Metodo que muestra por pantalla el menu de operaciones trigonometricas y devuelve la opcion elegida
	  Entradas:Opcion de menu
	  Salidas:Muestra el menu en pantalla y devuelve la opcion elegida
	  Precondiciones:Ninguna
	  Postcondiciones:Ser veran en pantalla 6 opciones y devolvera la opcion elegida
	  */
	public static int mostraryValidarMenuTrigonometria(){
		
		System.out.println("\n0--VOLVER");
		System.out.println("1--SENO");
		System.out.println("2--COSENO");
		System.out.println("3--TANGENTE");
		System.out.println("4--SECANTE");
		System.out.println("5--COSECANTE");
		System.out.println("6--COTANGENTE");
		
		int opcionT=0;
		
		//abrimos el flujo de teclado
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Elija una opcion");
		
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
		
		
		
		return opcionT;
	
	}

}
