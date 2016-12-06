package Main;
import java.util.Scanner;

import MenusYValidaciones.*;
import OperacionesAritmeticas.*;
import OperacionesTrigonometricas.*;
import OperacionesLeyDeOhm.*;

//
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
  				
  				CASO 3: OPERACIONES LEY DE OHM
  
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
	
 ----------NIVEL DOS: OPERACIONES LEY DE OHM------------
 CASO 3: 
 	SI OPCION ES DISTINTO A SALIR  					
		SEGUN OPCION		
			CASO 0: SALIR
			CASO 1: INTENSIDAD
			CASO 2: RESISTENCIA
			CASO 3: VOLTAJE
			CASO 4: POTENCIA 							
		FIN SEGUN
	FIN SI 
 * */

public class Main {

	public static void main(String[]args){
		
	
		int opcion = 0;
		int opcionSubmenu = 0;  
		
		Scanner teclado=new Scanner(System.in);
		int numeroOperandos = 0;
		
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
		
		//variables para almacenar las distintas magnitudes electricas
		double intensidad = 0;
		double resistencia = 0;
		double voltaje = 0;
		double potencia = 0;
		
		
		do{
			//Mostrar y validar menu principal.
			opcion = MenusyValidaciones.mostraryValidarMenuPrincipal();
			
			
			if(opcion != 0){
				
				switch(opcion){
				
				//CASO 1:	OPERACIONES ARITMETICAS
				case 1:
					
					opcionSubmenu = MenusyValidaciones.mostraryValidarMenuAritmetica();
					
					if(opcionSubmenu!=0){
						
						switch(opcionSubmenu){
							
							//CASO 1: SUMAR
							case 1:
								System.out.println("Introduce el primer sumando");	
								numero1=teclado.nextDouble();
								System.out.println("\nIntroduce el segundo sumando");	
								numero2=teclado.nextDouble();
								resultado = OperacionesAritmeticas.suma(numero1, numero2);
								
								break;
							//CASO 2: RESTAR
							case 2:
								System.out.println("Introduce el primer numero");
								numero1=teclado.nextDouble();
								System.out.println("Introduce el segundo numero");
								numero2=teclado.nextDouble();
								resultado =  OperacionesAritmeticas.resta(numero1, numero2);
								break;
							//CASO 3: MULTIPLICAR
							case 3:
								System.out.println("Introduce el primer numero");	
								numero1=teclado.nextDouble();
								System.out.println("\nIntroduce el segundo numero");	
								numero2=teclado.nextDouble();
								resultado =  OperacionesAritmeticas.multiplicar(numero1, numero2);
								
								break;
							//CASO 4: DIVIDIR
							case 4:
								System.out.println("Introduzca el dividendo");	
								dividendo=teclado.nextInt();
								System.out.println("Introduzca el divisor");	
								divisor=teclado.nextInt();
								resultado =  OperacionesAritmeticas.dividir(dividendo,divisor);
								break;
								
							//CASO 5: RAIZ CUADRADA
							case 5:
								System.out.println("Introduzca el radicando");	
								radicando=teclado.nextInt();
								resultado = OperacionesAritmeticas.raizCuadrada(radicando);
								break;
							//CASO 6: POTENCIA
							case 6:
								System.out.println("Introduzca la base");	
								base=teclado.nextDouble();
								System.out.println("Introduzca el exponente");	
								exponente=teclado.nextInt();
								resultado =  OperacionesAritmeticas.potencia(base, exponente);
								
								break;
							//CASO 7: SUMATORIO
							case 7:
								System.out.println("Introduzca el numero al que desea calcularle el sumatorio");	
								numeroSumatorio=teclado.nextInt();
								resultado =  OperacionesAritmeticas.sumatorio(numeroSumatorio);
								break;
						}//FIN SEGUN
					}//FIN SI 
					
					
				//CASO 2: OPERACIONES TRIGONOMETRICAS
				case 2: 
					opcionSubmenu = MenusyValidaciones.mostraryValidarMenuTrigonometria();
					
					if(opcionSubmenu!=0){
						
						switch(opcionSubmenu){
						
						//COSENO
						case 1:
							
							break;
							
						//SENO
						case 2:
							
							break;
						
						//TANGENTE
						case 3:
							
							break;
							
						//COSECANTE
						case 4:
							
							break;
							
						//SECANTE
						case 5 :
							
							break;
							
						//COTANGENTE
						case 6:
							
							break;
						
						
						}
						
					}//FIN SI
					
					break;
					
				//CASO 3: OPERACIONES LEY DE OHM
				case 3: 
					opcionSubmenu = MenusyValidaciones.mostrarYValidarMenuLeyOhm();
					
					if ( opcionSubmenu != 0 )
					{
						switch ( opcionSubmenu )
			            {
			                case 1 : 
								{	
									System.out.println("\n_.:: Formula I = V / R ::._\n");
									do
									{
										System.out.print("Introduce el voltaje: ");
										voltaje = teclado.nextDouble();
									} while ( voltaje <= 0 );
									
									do
									{
										System.out.print("Introduce la resistencia: ");
										resistencia = teclado.nextDouble();
									} while ( resistencia <= 0 );
									
									//Calculamos la intensidad
									intensidad = OperacioneLeyDeOhm.calcularIntensidad(voltaje, resistencia);
									
									//Imprimimos resultado
									System.out.println("\nI = "+intensidad +" Amperios");			
								} 
								break;
								
			                case 2 : 
								{
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
									resistencia = OperacioneLeyDeOhm.calcularResistencia(voltaje, intensidad);
									
									//Imprimimos resultado
									System.out.println("\nR = "+resistencia +" Ohmios\n");
								}
								break;
								
			                case 3 : 
								{
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
									voltaje = OperacioneLeyDeOhm.calcularVoltaje(intensidad, resistencia);
									
									//Imprimimos resultado
									System.out.println("\nV = "+voltaje +" Voltios\n");
								}
								break;
								
							case 4 : 
								{
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
									potencia = OperacioneLeyDeOhm.calcularPotencia(intensidad, voltaje);
									
									//Imprimimos resultado
									System.out.println("\nW = "+potencia +" Vatios\n");
								}
			            }
					}
					
					break;
				}
			}
			
		}while(opcion!=0); 
		
		
	}

}
