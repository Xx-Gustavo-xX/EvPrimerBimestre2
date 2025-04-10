package EvPrimerBimestre2;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		String pago;
		
		boolean pagoEntrada;
		int edad;
		System.out.println("Ingrese su edad");
		Scanner inEd = new Scanner(System.in);
		edad = inEd.nextInt();
		
		if(edad >= 18) {
			
			System.out.println("¿Pagó su entrada?");
			Scanner inPago = new Scanner(System.in);
			pago = inPago.next(); 
			
			
			
			if(pago.equalsIgnoreCase("si") ) {
				pagoEntrada = true;
			}
			
			else {
				pagoEntrada = false;
			}
			if(pagoEntrada) {
				System.out.println("Puede pasar");
			}
			else {
				System.out.println("Entrada no abonada. No puede pasar");
			}
			}
				
	
		else {
			System.out.println("Entrada no permitida");
		}
	}
	}
