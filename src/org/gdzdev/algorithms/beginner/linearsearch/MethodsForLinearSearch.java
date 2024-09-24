package org.gdzdev.algorithms.beginner.linearsearch;

public class MethodsForLinearSearch {

    // Busqueda lineal con un for i
    public static int findValueFori (int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) { // si el valor del indice == al valor buscado
                return i; // retorna el indice
            }
        }
        return -1; // de lo contrario
    }

    // Busqueda lineal con un forEach
    public static int findValueForEach (int[] arr, int value) {
        int count = 0; // sera nuestro indice.
        for (Integer num : arr) {
            if (num == value) {
                return count; // número de vueltas == al índice del elemento.
            }
            count++; // PostIncremento hasta encontrar el valor
        }
        return -1; // retornamos -1 si el valor no existe en el array
    }

    public static int findValueWhile (int[] arr, int value) {
        int count = 0; // sera nuestro indice.
        while (count < arr.length) { // mientras count sea menor a la longitud del array.
            if (arr[count] == value) {
                return count; // número de vueltas == al indíce del elemento
            }
            count++; // postIncremento
        }
        return -1; // -1 si el valor no existe.
    }
}
