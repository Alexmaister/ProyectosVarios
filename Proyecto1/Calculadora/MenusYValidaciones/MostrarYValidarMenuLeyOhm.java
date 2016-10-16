package MenusYValidaciones;

import java.util.Scanner;

public class MostrarYValidarMenuLeyOhm 
{
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
