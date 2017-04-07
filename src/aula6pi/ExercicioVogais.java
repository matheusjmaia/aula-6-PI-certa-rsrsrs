/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6pi;

import java.util.Scanner;

/**
 *
 * @author matheus.jmaia
 */
public class ExercicioVogais {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("INSIRA A LETRA");
        String letra = console.next();
        letra = letra.toUpperCase();
        switch (letra){
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("Essa letra é uma vogal.");
                break;
            case "B":
            case "C":
            case "D":
            case "F":
            case "G":
            case "H":
            case "J":
            case "K":
            case "L":
            case "M":
            case "N":
            case "P":
            case "Q":
            case "R":
            case "S":
            case "T":
            case "V":
            case "W":
            case "X":
            case "Y":
            case "Z":
                System.out.println("Essa letra é uma consoante.");
                break;
            default:
                System.out.println("Não é uma letra!");
        }
    }
}
