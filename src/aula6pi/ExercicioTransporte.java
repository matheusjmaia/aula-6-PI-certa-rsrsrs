package aula6pi;

import java.util.Scanner;

public class ExercicioTransporte {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Qual é o tipo de material?");
        String material = console.next();
        System.out.println("Qual é a temperatura do local de transporte?");
        double temperaturaLocal = console.nextDouble();
        switch (material.toUpperCase()) {
            case "A":
                if ((temperaturaLocal >= 10) && (temperaturaLocal <= 17)) {
                    System.out.println("Local apropriado para o transporte");
                } else {
                    System.out.println("Local não apropriado para o transporte");
                }
                break;
            case "B":
                if ((temperaturaLocal >= 11) && (temperaturaLocal <= 16)) {
                    System.out.println("Local apropriado para o transporte");
                } else {
                    System.out.println("Local não apropriado para o transporte");
                }
                break;
            case "C":
                if ((temperaturaLocal >= 12) && (temperaturaLocal <= 15)) {
                    System.out.println("Local apropriado para o transporte");
                } else {
                    System.out.println("Local não apropriado para o transporte");
                }
                break;
            case "D":
                if ((temperaturaLocal >= 13) && (temperaturaLocal <= 14)) {
                    System.out.println("Local apropriado para o transporte");
                } else {
                    System.out.println("Local não apropriado para o transporte");
                }
                break;
            default:
                System.out.println("Tipo de material inválido");

        }
    }

}
