package org.gdzdev.algorithms.beginner.linearsearch;

/**
 * Esta clase proporciona varios métodos para realizar una búsqueda lineal en un arreglo.
 * Implementa tres versiones diferentes del algoritmo de búsqueda lineal utilizando
 * un bucle for, un bucle forEach y un bucle while.
 *
 * <p>Los métodos devuelven el índice del valor buscado dentro del arreglo, o -1 si
 * el valor no se encuentra.</p>
 *
 * @author gdzdev
 * @since  2024-09-24
 */
public class MethodsForLinearSearch {

    /**
     * Realiza una búsqueda lineal en un arreglo utilizando un bucle for.
     *
     * @param arr El arreglo en el que se busca el valor.
     * @param value El valor que se desea buscar en el arreglo.
     * @return El índice del valor buscado si se encuentra, o -1 si no se encuentra.
     */
    public static int findValueFori(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            // Si el valor en el índice actual es igual al valor buscado
            if (arr[i] == value) {
                return i; // Retorna el índice del valor encontrado
            }
        }
        return -1;
    }

    /**
     * Realiza una búsqueda lineal en un arreglo utilizando un bucle forEach.
     *
     * @param arr El arreglo en el que se busca el valor.
     * @param value El valor que se desea buscar en el arreglo.
     * @return El índice del valor buscado si se encuentra, o -1 si no se encuentra.
     */
    public static int findValueForEach(int[] arr, int value) {
        int count = 0; // Variable que actúa como índice
        for (Integer num : arr) {
            if (num == value) {
                return count; // Retorna el índice actual
            }
            count++; // Incrementa el índice para la siguiente iteración
        }
        return -1;
    }

    /**
     * Realiza una búsqueda lineal en un arreglo utilizando un bucle while.
     *
     * @param arr El arreglo en el que se busca el valor.
     * @param value El valor que se desea buscar en el arreglo.
     * @return El índice del valor buscado si se encuentra, o -1 si no se encuentra.
     */
    public static int findValueWhile(int[] arr, int value) {
        int count = 0; // Variable que actúa como índice
        // Mientras el índice sea menor que la longitud del arreglo
        while (count < arr.length) {
            // Si el valor en la posición actual es igual al valor buscado
            if (arr[count] == value) {
                return count; // Retorna el índice del valor encontrado
            }
            count++; // Incrementa el índice para la siguiente iteración
        }
        return -1;
    }
}

