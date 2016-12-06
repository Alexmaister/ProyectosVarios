package Test;

import OperacionesLeyDeOhm.OperacioneLeyDeOhm;

public class TestOperacionesLeyDeOhm 
{
	public static void main(String[] args) {
		
		// Numeros enteros
		System.out.println("\nPrueba con numeros enteros ");
		System.out.println("Intensidad :"+OperacioneLeyDeOhm.calcularIntensidad(34, 62));
		System.out.println("Resistencia :"+OperacioneLeyDeOhm.calcularResistencia(23, 92));
		System.out.println("Voltaje :"+OperacioneLeyDeOhm.calcularVoltaje(223, 120));
		System.out.println("Potencia: "+OperacioneLeyDeOhm.calcularPotencia(86, 99));
		
		// Numeros reales
		System.out.println("\nPrueba con numeros reales");
		System.out.println("Intensidad :"+OperacioneLeyDeOhm.calcularIntensidad(52.6, 23.8));
		System.out.println("Resistencia :"+OperacioneLeyDeOhm.calcularResistencia(78.8, 42.7));
		System.out.println("Voltaje :"+OperacioneLeyDeOhm.calcularVoltaje(72.1, 3.7));
		System.out.println("Potencia: "+OperacioneLeyDeOhm.calcularPotencia(23.45, 154.64));
		
		// Numeros enteros  y reales
		System.out.println("\nPrueba con numeros enteros y reales");
		System.out.println("Intensidad :"+OperacioneLeyDeOhm.calcularIntensidad(43, 4.8));
		System.out.println("Resistencia :"+OperacioneLeyDeOhm.calcularResistencia(4, 5.7));
		System.out.println("Voltaje :"+OperacioneLeyDeOhm.calcularVoltaje(72, 3.6));
		System.out.println("Potencia: "+OperacioneLeyDeOhm.calcularPotencia(23, 126.64));
	}
	
}
