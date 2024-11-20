package com.campusdual.classroom;
import java.util.List;
import java.util.ArrayList;

public class Exercise07 {

    public static void main(String[] args) {

    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 10; i >= 1; i--) {
            lista.add(i);
        }
        int indice = lista.indexOf(num);
        if (indice < 0) {
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        } else {
            System.out.println("El elemento " + num + " se encuentra en la posición: " + (indice + 1));
        }
    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int sumatorio=0;
        for(int i=1;i<=num;i++){
            sumatorio+=i;
        }
        System.out.println(sumatorio);
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        for(int i=1;i<=num;i++){
            System.out.println(i);
        }
        System.out.println();
    }

}
