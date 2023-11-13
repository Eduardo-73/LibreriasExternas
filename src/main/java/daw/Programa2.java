/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import javax.swing.JOptionPane;

/**
 *
 * @author eduar
 */
public class Programa2 {

    public static void main(String[] args) {

        String[] opcionesMenu = {"1.- PIN",
            "2.- Sistema operativo", "3.- Contraseña personalizada"};
        String opcionElegida;
        String opcionRepetir = "";
        int tamanio = 0;
        boolean repertir = true;
        do {
            opcionElegida = (String) JOptionPane.showInputDialog(null,
                    "Elige una opción", "Generador de contraseñas",
                    JOptionPane.QUESTION_MESSAGE, null,
                    opcionesMenu, "1.- PIN");
            switch (opcionElegida) {
                case "1.- PIN" -> {
                    JOptionPane.showMessageDialog(null,
                            "Has elegido la opcion 1");
                    JOptionPane.showMessageDialog(null,
                            "Este es tu pin: " + Generador.generarPin());
                }

                case "2.- Sistema operativo" -> {
                    JOptionPane.showMessageDialog(null,
                            "Has elegido la opcion 2");
                    JOptionPane.showMessageDialog(null,
                            "Este es tu pin: " + Generador.generarContraseñaUsuario());
                }

                case "3.- Contraseña personalizada" -> {
                    JOptionPane.showMessageDialog(null,
                            "Has elegido la opcion 3");
                    do {
                        try {
                            tamanio = Integer.parseInt(
                                    JOptionPane.showInputDialog("Introduce el "
                                            + "tamaño de la contraseña"));
                            repertir = false;
                        } catch (NumberFormatException nfe) {
                            JOptionPane.showMessageDialog(null,
                                    "Introduce un número entero ",
                                    "Error",
                                    JOptionPane.WARNING_MESSAGE);
                        }
                    } while (repertir);
                    String opcionC = JOptionPane.showInputDialog("Introduce "
                            + "los dijitos para crear tu contraseña");
                    JOptionPane.showMessageDialog(null,
                            "Este es tu pin: " + Generador.generarContraseniaAleatoria(
                                    tamanio, opcionC));
                }
            }
            do {
                opcionRepetir = JOptionPane.showInputDialog(null,
                        "¿Quieres repetir el programa? (Si o No)");
            } while (!(opcionRepetir.equalsIgnoreCase("si")
                    || opcionRepetir.equalsIgnoreCase("no")));
        } while (!opcionRepetir.equalsIgnoreCase("no"));
    }
}
