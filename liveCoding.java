package livecoding4;

/*  Construye un programa que imprima números del 1 al 100.

2.- Cuando el número sea múltiplo de 3 imprimir Fizz en lugar del número.

3.- Cuando el número sea un múltiplo de 5 imprimir Buzz en lugar del número.

4.- Cuando el número sea múltiplo de 3 y de 5 imprimir FizzBuzz en lugar del número.

5.- El programa no recibira inputs y cada número debe ir impreso en una línea.

6.- Debes escribir el código en una clase llamada FizzBuzz que contenga por lo menos un método, imprimir.

7.- En una clase Main, debes crear un objeto de dicha clase para imprimir el resultado.*/

public class liveCoding {
public static void main(String[] args) {

	for (int i =1; i<=100;i++) {
		
	if( i % 3 == 0)
	{
		System.out.println("Fizz");
	}
	else if (i % 5 ==0 ) {
		System.out.println("Buzz");
	}
	else if (i % 3 == 0 && i % 5 ==0 ) {
		System.out.println("FizzBuzz");
	}
	else {
		System.out.println(i);
	}
		
	}
}
}