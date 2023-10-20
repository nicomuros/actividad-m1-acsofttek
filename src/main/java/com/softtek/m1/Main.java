package com.softtek.m1;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        // Mensaje de bienvenida
        JOptionPane.showMessageDialog(null, """
                Bienvenido a calculadora.
                
                Este programa consiste en un algoritmo que lee dos valores ingresados por el usuario,
                los suma y por último los muestra en pantalla.
                """);

        // Variable control. Cambia de estado cuando el usuario elije salir del programa
        boolean continuar = true;
        while (continuar){
            // Variables para almacenar los input del usuario
            String userInputNumeroUno;
            String userInputNumeroDos;

            // Registro del input
            userInputNumeroUno = JOptionPane.showInputDialog("Ingrese el primer número: ");
            userInputNumeroDos = JOptionPane.showInputDialog("Ingrese el segundo número: ");

            // Se intenta ejecutar la operación. Falla si el usuario ingresó algun caracter que no se pueda
            // convertir a tipo Double
            try {
                double numeroUno = Double.parseDouble(userInputNumeroUno);
                double numeroDos = Double.parseDouble(userInputNumeroDos);

                double resultado = numeroUno + numeroDos;

                // Se muestra el resultado, y se comprueba si el usuario desea realizar otra operación.
                String userInputContinuar = JOptionPane.showInputDialog(null,
                        "Numero 1: " + numeroUno +
                                "\nNumero 2: " + numeroDos +
                                "\nResultado de la suma: " + resultado +
                                "\n\nIngrese 1 para realizar otra operación, \no cualquier otro valor para salir.");

                // Se verifica si el usuario decidió continuar con la ejecución del programa
                if (!userInputContinuar.equals("1")){
                    continuar = false;
                }
            } catch (Exception e) {
                // Manejo de error. Se ejecuta si el usuario ingresó cualquier valor que no se pueda convertir a tipo Double
                JOptionPane.showMessageDialog(null, "Entrada no válida. Recuerde que debe ingresar solo números.");
            }

        }

        // Mensaje de despedida
        JOptionPane.showMessageDialog(null, "¡Muchas gracias por usar la aplicación! \n\nAutor: Nicolás Muros.");
    }
}