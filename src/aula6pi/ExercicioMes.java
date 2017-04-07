
package aula6pi;

import java.util.Scanner;


public class ExercicioMes {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Escreva o mês: ");
        String mes = console.next();
        mes = mes.toUpperCase();
        switch (mes){
            case "JANEIRO":
            case "MARÇO":
            case "MAIO":
            case "JULHO":
            case "AGOSTO":
            case "OUTUBRO":
            case "DEZEMBRO":
                System.out.println("Esse mês tem 31 dias.");
                break;
            case "ABRIL":
            case "JUNHO":
            case "SETEMBRO":
            case "NOVEMBRO":
                System.out.println("Esse mês tem 30 dias.");
                break;
            case "FEVEREIRO":
                System.out.println("Esse mês tem 28 dias.");
                break;
            default:
                System.out.println("Mês inválido!");
        }
        
    }
}
