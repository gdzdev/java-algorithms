package org.gdzdev.algorithms.beginner.linearsearch;

import static org.gdzdev.algorithms.beginner.linearsearch.MethodsForLinearSearch.*;

public class LinearSearch {
    public static void main (String[] args) {
        // definimos un array de enteros
        int[] nums = {2, 6, 7, 10, 9, 1, 8, 4};
        int value = 11; //valor a buscar

        // guardamos el resultado que retorna
        int result = findValueForEach(nums, value);

        if (result != -1) { // si es diferente de -1, el valor fue encontrado.
            System.out.printf("El elemento %d se encuentra en la posición: %d", value, result);
        } else { // de lo contrario.
            System.out.println("El elemento no fue encontrado!!");
        }
    }
}
