package org.gdzdev.algorithms.beginner.linearsearch;

public class LinearSearch {
    public static void main (String[] args) {
        // array de enteros
        int[] nums = {2, 6, 7, 10, 9, 4, 8, 4};
        int value = 11; //valor a buscar

        // guardando resultado del metodo
        int result = findItem(nums, value);

        if (result != -1) { // si es diferente de -1 el valor fue encontrado
            System.out.printf("El elemento %d se encuentra en el indice: %d", value, result);
        } else { // de lo contrario
            System.out.println("El elemento no fue encontrado!!");
        }
    }
    // metodó para buscar numero de manera lineal
    public static int findItem (int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) { // si el indice es igual al valor buscado
                return i; // retorna el indice
            }
        }
        return -1; // de lo contrario
    }
}
