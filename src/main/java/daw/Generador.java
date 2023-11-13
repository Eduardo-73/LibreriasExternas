/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author edu
 */
public class Generador {

    //Métodos
    public static String generarPin() {
        return RandomStringUtils.randomNumeric(4);
    }

    public static String generarContraseñaUsuario() {
        return RandomStringUtils.randomAlphanumeric(8);
    }

    public static String generarContraseniaAleatoria(int tamanio, String caracteres) {
        return RandomStringUtils.random(tamanio, caracteres);
    }
}
