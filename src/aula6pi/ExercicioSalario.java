package aula6pi;

import java.util.Scanner;

public class ExercicioSalario {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("INSIRA O SEU NOME");
        String nome = console.next();
        System.out.println("INSIRA SEU NÍVEL DA EMPRESA");
        int nivel = console.nextInt();
        System.out.println("INSIRA A QUANTIDADE DE HORAS TRABALHADAS");
        double horasT = console.nextDouble();
        switch (nivel) {
            case 1:
                double salario = horasT * 15;
                System.out.println("O funcionário " + nome + " trabalhou " + horasT + " horas por R$ " + 15.00 + " (Nível " + nivel + ")" + " e deve receber R$ " + salario);
                break;
            case 2:
                double salario2 = horasT * 18;
                System.out.println("O funcionário " + nome + " trabalhou " + horasT + " horas por R$ " + 18.00 + " (Nível " + nivel + ")" + " e deve receber R$ " + salario2);
                break;
            case 3:
                double salario3 = horasT * 22;
                System.out.println("O funcionário " + nome + " trabalhou " + horasT + " horas por R$ " + 22.00 + " (Nível " + nivel + ")" + " e deve receber R$ " + salario3);
                break;
            case 4:
                double salario4 = horasT * 27;
                System.out.println("O funcionário " + nome + " trabalhou " + horasT + " horas por R$ " + 27.00 + " (Nível " + nivel + ")" + " e deve receber R$ " + salario4);
                break;
            case 5:
                double salario5 = horasT * 33;
                System.out.println("O funcionário " + nome + " trabalhou " + horasT + " horas por R$ " + 33.00 + " (Nível " + nivel + ")" + " e deve receber R$ " + salario5);
            default:
                System.out.println("Nível incorreto!");
            }
        }
        
        
    }

