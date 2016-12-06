package MenusYValidaciones;

import java.util.Scanner;

public class MenusyValidaciones {
	
	/*CABEZERA:int mostraryValidarMenuPrincipal()
	 * Descripcion:Metodo que muestra por pantalla el menu principal y valida la opcion 
	 * Entradas:Ninguna	
	 * Precondiciones:Ninguna
	 * Salidas:Muestra el menu en pantalla y devuelve la opcion elegida
	 * Postcondiciones:Ser veran en pantalla 2 opciones y la opcion sera un entero entre 0 y 3
	 * */
		
	public static int mostraryValidarMenuPrincipal(){
		
		System.out.println("MENU DE CALCULADORA CIENTIFICA");
		System.out.println("------------------------------");
		System.out.println("1--OPERACIONES ARITMETICAS");
		System.out.println("2--OPERACIONES TRIGONOMETRICAS");
		System.out.println("3--OPERACIONES LEY DE OHM");
		System.out.println("\n0--SALIR");
		
				//abrimos flujo del teclado
				
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
				
				
				return opcion;	
	}
	
	/*CABEZERA:int mostraryValidarMenuAritmetica()
	 * Descripcion:Metodo que muestra por pantalla el menu de operaciones aritmeticas y devuelve la opcion elegida
	 * Entradas:Ninguna
	 * Precondiciones:Ninguna
	 * Salidas:Muestra el menu en pantalla y devuleve la opcion elegida
	 * Postcondiciones:Ser veran en pantalla 8 opciones y la opcion sera un entero entre 0 y 7
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
				
				System.out.println("Elija una opcion");
				
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
	
	/*CABEZERA:int mostraryValidarMenutrigonometria()
	  Descripcion:Metodo que muestra por pantalla el menu de operaciones trigonometricas y devuelve la opcion elegida
	  Entradas:Ninguna
	  Precondiciones:Ninguna
	  Salidas:Muestra el menu en pantalla y devuelve la opcion elegida
	  Postcondiciones:Ser veran en pantalla 6 opciones y la opcion sera un entero entre 0 y 6
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
	
	/*CABEZERA:int mostraryValidarMenuLeyOhm()
	  Descripcion:Metodo que muestra por pantalla el menu de operacionesde la Ley de Ohm y devuelve la opcion elegida
	  Entradas:Ninguna
	  Precondiciones:Ninguna
	  Salidas:Muestra el menu en pantalla y devuelve la opcion elegida
	  Postcondiciones:Ser veran en pantalla 6 opciones yla opcion sera un entero entre 0 y 4
	  */
	
	public static int mostrarYValidarMenuLeyOhm() 
	{
        Scanner scanner = new Scanner(System.in);
	    int opcionMenu = 0;
	     
		//Mientras la opcion elegida no una opcion valida del menu
	    do
	    {
	         //Mostramos el menu
	         System.out.println("\n_.::Calculadora electronica::._\n");
	         System.out.println("0 -- Volver");
	         System.out.println("1 -- Calcular Intensidad");
	         System.out.println("2 -- Calcular Resistencia");
	         System.out.println("3 -- Calcular Voltaje" );
	         System.out.println("4 -- Calcular Potencia");
             
	         //Leemos la respuesta del usuario
	         System.out.print("\nElije la opcion que desea realizar: ");
	         opcionMenu = scanner.nextInt();
	    } while ( (opcionMenu < 0) || (opcionMenu > 5 ) );
	    
	    //Devolvemos la opcion del menu que el usuario eligio
	    return(opcionMenu);
	}

}
