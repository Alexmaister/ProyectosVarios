package Main;


import java.util.*;

import Menus.*;
import Validaciones.*;

/*ANALISIS:
 * 
 * Programa que simulara una calculadora con operaciones tanto aritmeticas como trigonometricas
 * Entradas:Numeros con los que realizar operaciones 
 * */
public class Main {

	public static void main(String[]args){
	 
		int opcion=0;
		
		//mostramos menu principal
		MenuPrincipal.menuPrincipal();
		//validamos la opvion del menu principal
		opcion=ValidarMenuPrincipal.validarMenuP();
		
		//si la opcion no es salir
		if(opcion!=0){
			
			//si elegimos menu 1
			if(opcion==1){
				
				//mostramos menu de aritmetica
				MenuAritmética.menuAritmetica();
				//validamos la opcion del menu de RITMETICA
				opcion=ValidarMenuAritmética.validarMenuA();
			
			//si elegimos menu 2	
			}else if(opcion==2){
			
				//mostramos menu de trigonometria
				MenuTrigonometría.menuTrigonometría();
				//validamos la opcion del menu de trigonometria
				opcion=ValidarMenuTrigonometría.validarMenuTrigonometria();
				
			
			}
		}
		
	}

}
