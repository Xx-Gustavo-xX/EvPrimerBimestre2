package EvPrimerBimestre2;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		
		char s = 's', m = 'm', l = 'l';
		String Talle;
		
		System.out.println("Ingrese su talle (en minuscula)");
		Scanner inTalle = new Scanner(System.in);
		Talle =  inTalle.next();
		
		
	
       char talle = Talle.charAt(0);
		
		
		switch(talle) {
		case 's':
		case 'S':
			
			System.out.println("Quedan 5 remeras talle S");
			break;
		
		case 'm':
		case 'M':


			System.out.println("Quedan 2 remeras talle M");
			break;
			
		case 'l':
		case 'L':

			System.out.println("No quedan remeras para gordos");
			break;
			
		default:
			System.out.println("Talle inválido");
			break;
		}
		}
		
		
		 
	}
		

	



