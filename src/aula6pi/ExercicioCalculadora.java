
package aula6pi;

import java.util.Scanner;

public class ExercicioCalculadora {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("INSIRA O PRIMERO NUMERO");
        double n1 = console.nextDouble();
        System.out.println("INSIRA O SEGUNDO NUMERO");
        double n2 = console.nextDouble();
        System.out.println("ESCREVA A OPERAÇÃO");
        String operacao = console.next();
        switch (operacao){
            case "+":
                double resultado = n1 + n2;
                System.out.println("O resultado da soma de "+n1+ "e "+n2+" é: "+resultado);
                break;
            case "-":
                double resultado1 = n1 - n2;
                System.out.println("O resultado da subtração de "+n1+ "e "+n2+" é: "+resultado1);
                break;
            case "*":
                double resultado2 = n1 * n2;
                System.out.println("O resultado da multiplicação de "+n1+ "e "+n2+" é: "+resultado2);
                break;
            case "/":
                double resultado3 = n1 / n2;
                System.out.println("O resultado da divisão de "+n1+ "e "+n2+" é: "+resultado3);
                
        }
    }
}
