package br.indra.calculadora;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		

		System.out.print("Digite um numero");
		Scanner entrada = new Scanner(System.in);
	    
	    double num1 = entrada.nextDouble();
	    System.out.print("Digite a operação");
	    String ope = entrada.next();
	    System.out.print("Digite outro numero");
	    double num2 = entrada.nextDouble();
	    
	    
	   
	    
	    switch(ope){
	    case "+": somar(num1,num2);
	    break;
	    case "-": subtrair(num1, num2);
	    break;
	    case "*": multiplicar(num1, num2);
	    break;
	    case "/": dividir(num1, num2);
	    }
	}
	   
	    

	    
	
private static  void  somar(double num, double num2){
		
		double result =  num + num2;
		System.out.print(result);
		
	}
	
private static void subtrair (double num, double num2){
		double resul = num - num2;
		System.out.print(resul);
		
				
	}

private static void multiplicar (double num, double num2){
	double	resul = num * num2;
	System.out.print(resul);
	
	}

private static void dividir (double num, double num2){
		double resul = num / num2;
		System.out.print(resul);
		
	}
}
