package EvPrimerBimestre2;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		int i = 100;	
		
		while(i > 0) {
				
			try {
                System.out.println("Bateria:" + i +"%");  
                
                Thread.sleep(20);  
                i--;  
            } catch (InterruptedException e) {
                System.out.println("El hilo fue interrumpido.");
            }
			if(i == 19) {
				System.out.println("Bateria baja");
				try {
	             
	                Thread.sleep(1000);  
	               
	            } catch (InterruptedException e) {
	                System.out.println("El hilo fue interrumpido.");
	            }
			}
		}
		System.out.println("Bateria agotada");
		}
	}