package prueba;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        final int MIN_EDAD = 1;
        final int MAX_EDAD = 120;
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());

        if (edad >= MIN_EDAD && edad <= MAX_EDAD) {
            System.out.print("Ingrese su género: ");
            char genero = input.nextLine().charAt(0);
            if (genero == 'M' || genero == 'F' || genero == 'm' || genero == 'f') {
                if (edad >= 65 || (genero == 'F' && edad >= 60)) {
                    System.out.println("Puede jubilarse");
                } else {
                    System.out.println("No puede jubilarse");
                }
            } else {
                System.out.println("Género inválido");
            }

        } else {
            System.out.println("Edad inválida");
        }
        
    } // Cierre de main

    
    
}
