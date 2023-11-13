/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import javax.swing.JOptionPane;

/**
 *
 * @author edu
 */
public class Programa {

    public static void main(String[] args) {

        String menu = """
                      1.- Generar Pin (4 dígitos entre 0 y 9)
                      2.- Generar contraseña de 8 digitos para un usuario
                      3.- Generar una contraseña aleatoria del tamaño que tu elijas
                      4.- Salir
                      """;
        int opcion = 0;
        do {
            do {
                try {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Error");
                    JOptionPane.showMessageDialog(null,
                            "Prueba poniendo 1, 2, 3 o 4");
                }
            } while (opcion < 1 || opcion > 4);

            switch (opcion) {
                case 1 -> {
                    JOptionPane.showMessageDialog(null,
                            "Has elegido la opcion 1");
                    JOptionPane.showMessageDialog(null,
                            "Este es tu pin: " + Generador.generarPin());
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null,
                            "Has elegido la opcion 2");
                    JOptionPane.showMessageDialog(null,
                            "Este es tu pin: " + Generador.generarContraseñaUsuario());
                }
                case 3 -> {
                    JOptionPane.showMessageDialog(null,
                            "Has elegido la opcion 3");
                    int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el "
                            + "tamaño de la contraseña"));
                    String opcionC = JOptionPane.showInputDialog("Introduce "
                            + "los dijitos para crear tu contraseña");
                    JOptionPane.showMessageDialog(null,
                            "Este es tu pin: " + Generador.generarContraseniaAleatoria(
                                    tamanio, opcionC));
                }
            }
        } while (!(opcion == 4));
    }
}
