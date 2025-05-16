package EvPrimerBimestre2;

import java.util.Scanner;

public class Ejercicio21 {

		public static void main(String[] args)throws InterruptedException  {
			int i = 100;	
			
			while(i > 0) {
				
			
				System.out.println("Bateria:" + i +"%");  
	                
	            Thread.sleep(20);  
	              
	            i--;  
	           
	            
			if(i == 19) {
				System.out.println("Bateria baja");
				
	            Thread.sleep(1000);  
	               
	            } 
			
				}
				System.out.println("Bateria agotada");
			
			}
		
			}
