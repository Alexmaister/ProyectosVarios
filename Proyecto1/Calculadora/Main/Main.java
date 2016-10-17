package Main;
import java.util.Scanner;

import MenusYValidaciones.*;
import OperacionesAritmeticas.*;
import OperacionesTrigonometricas.*;


/*ASIGNACION DE MODULOS
 * 
 * ALE: SUMAR, DIVIDIR, SUMATORIO, TANGENTE, COTANGENTE
 * PAULO: RESTAR, RAIZ, SENO, SECANTE
 * LUIS: MULTIPLICAR, POTENCIA, COSENO, COSECANTE
 * *****Si quereis cambiar un modulo por otro comentarlo aqui debajo***
 * 
 * CAMBIOS:....
 * */

/*
  ANALISIS:
     * Programa que simulara una calculadora con operaciones tanto aritmeticas como trigonometricas
  
  Requisitos:
      * Debe de ser capaz de realizar todas las operaciones descritas en el pseudocodigo
  
  Entradas:
      * Opciones de  interaccion con el menu
      * Numeros con los que se realizaran las operaciones
  
  Salidas:
      * Se mostraran por pantalla el resultado de las operaciones que se realizen
    
  Restrincciones: 
      * Ninguna
      
  Suposiciones: 
      * Ninguna
  
  
 PSEUDOCODIGO GENERALIZADO:
  
  INICIO
  
  	REPETIR
  
  		MOSTRAR Y VALIDAR MENU PRINCIPAL
  
  		SI	OPCION ES DISTINTO A SALIR
  
 			SEGUN OPCION
  
  				CASO 1:	OPERACIONES ARITMETICAS	
  					
  				CASO 2: OPERACIONES TRIGONOMETRICAS
  
  			FIN SEGUN
  
  		FIN SI
  
  	MIENTRAS OPCION NO SEA SALIR
  
  FIN
  
  ----------NIVEL DOS: OPERACIONES ARITMETICAS------------
 CASO 1: 
 	SI OPCION ES DISTINTO A SALIR  					
		SEGUN OPCION		
			CASO 0: SALIR
			CASO 1: SUMAR
			CASO 2: RESTAR
			CASO 3: MULTIPLICAR					
			CASO 4: DIVIDIR
			CASO 5: RAIZ CUADRADA
			CASO 6: POTENCIA
			CASO 7: SUMATORIO  							
		FIN SEGUN
	FIN SI 
  
   ----------NIVEL DOS: OPERACIONES TRIGONOMETRICAS------------
 CASO 2: 
	SI OPCION ES DISTINTO A SALIR	
		SEGUN OPCION		
			CASO 0: SALIR
			CASO 1: SENO
			CASO 2: COSENO
			CASO 3: TANGENTE					
			CASO 4: SECANTE
			CASO 5: COSECANTE
			CASO 6: COTANGENTE		
		FIN SEGUN
	FIN SI
  
  
  
 * */

public class Main {

	public static void main(String[]args){
		
		/*MostraryValidarMenuPrincipal MostrarMenuPrincipal = new MenusYValidaciones.MostraryValidarMenuPrincipal();
		MostraryValidarMenuAritmetica MostrarMenuAritmetica = new MenusYValidaciones.MostraryValidarMenuAritmetica();
		MostraryValidarMenuTrigonometria MostrarMenuTrigonometria = new MenusYValidaciones.MostraryValidarMenuTrigonometria();*/
		int opcion = 0;
		int opcionSubmenu = 0;  
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int numeroOperandos = 0;
		@SuppressWarnings("unused")
		double resultado = 0.0;
		double numero1 = 0.0;
		double numero2 = 0.0;
		//Variables para la division
		double dividendo = 0;
		double divisor = 0;
		//Variables para la raiz
		double radicando = 0.0;
		//Variables para la potencia
		double base = 0.0;
		int exponente =0;
		//Variables para el sumatorio
		int numeroSumatorio=0;
		//Variables para calculadora intensidad
		double intensidad = 0, voltaje = 0, resistencia = 0, potencia = 0;
		
		
		do{
			//Mostrar y validar menu.
			opcion = MostraryValidarMenuPrincipal.mostraryValidarMenuPrincipal();
			
			//SI OPCION ES DISTINTO A SALIR
			if(opcion != 0){
				//SEGUN OPCION
				switch(opcion){
				//CASO 1:	OPERACIONES ARITMETICAS
				case 1:
					//SI OPCION ES DISTINTO A SALIR  
					opcionSubmenu = MostraryValidarMenuAritmetica.mostraryValidarMenuAritmetica();
					if(opcionSubmenu!=0){
						//SEGUN OPCION	
						switch(opcionSubmenu){
							//CASO 0: SALIR
							//CASO 1: SUMAR
							case 1:
								System.out.println("Introduce el primer sumando");	
								numero1=teclado.nextDouble();
								System.out.println("\nIntroduce el segundo sumando");	
								numero2=teclado.nextDouble();
								resultado = Sumar.suma(numero1, numero2);
								PacoPinta.pinturillo(resultado);
								break;
							//CASO 2: RESTAR
							case 2:
								System.out.println("�Cuantos operandos desea utilizar para la resta?");	
								numeroOperandos=teclado.nextInt();
								resultado = Restar.resta(numeroOperandos);
								break;
							//CASO 3: MULTIPLICAR
							case 3:
								System.out.println("Introduce el primer numero");	
								numero1=teclado.nextDouble();
								System.out.println("\nIntroduce el segundo numero");	
								numero2=teclado.nextDouble();
								resultado = Multiplicar.multiplicacion(numero1, numero2);
								PacoPinta.pinturillo(resultado);
								break;
							//CASO 4: DIVIDIR
							case 4:
								System.out.println("Introduzca el dividendo");	
								dividendo=teclado.nextInt();
								System.out.println("Introduzca el divisor");	
								divisor=teclado.nextInt();
								resultado = Dividir.division(dividendo,divisor);
								break;
								
							//CASO 5: RAIZ CUADRADA
							case 5:
								System.out.println("Introduzca el radicando");	
								radicando=teclado.nextInt();
								resultado = Raiz.raizCuadrada(radicando);
								break;
							//CASO 6: POTENCIA
							case 6:
								System.out.println("Introduzca la base");	
								base=teclado.nextDouble();
								System.out.println("Introduzca el exponente");	
								exponente=teclado.nextInt();
								resultado = Potencia.potencia(base, exponente);
								PacoPinta.pinturillo(resultado);
								break;
							//CASO 7: SUMATORIO
							case 7:
								System.out.println("Introduzca el numero al que desea calcularle el sumatorio");	
								numeroSumatorio=teclado.nextInt();
								resultado = Sumatorio.sumatorio(numeroSumatorio);
								break;
						}//FIN SEGUN
					}//FIN SI 
					
					//LlamadorAritmetico.llamadorAritmetico();
					break;
				//CASO 2: OPERACIONES TRIGONOMETRICAS
				case 2: 
					opcionSubmenu = MostraryValidarMenuTrigonometria.mostraryValidarMenuTrigonometria();
					//LlamadorTrigonometrico.llamadorTrigonometrico();
					
					break;
				case 3: 
					opcionSubmenu = MostrarYValidarMenuLeyOhm.mostrarYValidarMenuLeyOhm();
					//LlamadorTrigonometrico.llamadorTrigonometrico();
					if(opcionSubmenu!=0){
						
						switch (opcionSubmenu){
						
						case 1 : 
							
							System.out.println("\n_.:: Formula I = V / R ::._\n");
							do
							{
								System.out.print("Introduce el voltaje: ");
								voltaje =teclado.nextDouble();
							} while ( voltaje <= 0 );
							
							do
							{
								System.out.print("Introduce la resistencia: ");
								resistencia = teclado.nextDouble();
							} while ( resistencia <= 0 );
							
							//Calculamos la intensidad
							intensidad = voltaje / resistencia;
							
							//Imprimimos resultado
							System.out.println("\nI = "+intensidad +" Amperios");			
						
						break;
						
	                case 2 : 
						
							System.out.println("\n_.:: Formula R = V / I ::._\n");
							do
							{
								System.out.print("Introduce el voltaje: ");
								voltaje = teclado.nextDouble();
							} while ( voltaje <= 0 );
							
							do
							{
								System.out.print("Introduce la intensidad: ");
								intensidad = teclado.nextDouble();
							} while ( intensidad <= 0 );
							
							//Calculamos la resistencia
							resistencia = voltaje / intensidad;
							
							//Imprimimos resultado
							System.out.println("\nR = "+resistencia +" Ohmios");
						
						break;
						
	                case 3 : 
						
							System.out.println("\n_.:: Formula V = I * R ::._\n");
							do
							{
								System.out.print("Introduce la intensidad: ");
								intensidad = teclado.nextDouble();
							} while ( intensidad <= 0 );
							
							do
							{
								System.out.print("Introduce la resistencia: ");
								resistencia = teclado.nextDouble();
							} while ( resistencia <= 0 );
							
							//Calculamos el voltaje
							voltaje = intensidad * resistencia;
							
							//Imprimimos resultado
							System.out.println("\nV = "+voltaje +" Voltios");
						
						break;
						
					case 4 : 
						
							System.out.println("\n_.:: Formula W = V * I ::._\n");
							do
							{
								System.out.print("Introduce el voltaje: ");
								voltaje = teclado.nextDouble();
							} while ( voltaje <= 0 );
							
							do
							{
								System.out.print("Introduce la intensidad: ");
								intensidad = teclado.nextDouble();
							} while ( intensidad <= 0 );
							
							//Calculamos la resistencia
							voltaje = intensidad * resistencia;
							
							//Imprimimos resultado
							System.out.println("\nW = "+potencia +" Vatios");
						}
						}
					
					break;
				}
			}
			
		}while(opcion!=0); 
		
		
	}

}
