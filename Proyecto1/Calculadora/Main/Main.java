package Main;


import Menus.*;
import Validaciones.*;

public class Main {

	public static void main(String[]args){
	 
		int opcion=0;
		
		MenuPrincipal.menuPrincipal();
		opcion=ValidarMenuPrincipal.validarMenuP();
		
		if(opcion==1){
			//asffddfdfadfsadfsadfadfadfasdf
			System.out.println("OPcion1");
			
		}else{
			
			System.out.println("OPcion2");
			
		}
		
	}

}
