package org.gdzdev.algorithms.beginner.linearsearch;

import static org.gdzdev.algorithms.beginner.linearsearch.MethodsForLinearSearch.*;

/**
 * Clase para probar los métodos de búsqueda lineal.
 * Se realizan pruebas sobre diferentes implementaciones de búsqueda lineal
 * y se imprime el resultado de la búsqueda.
 *
 * @author gdzdev
 * @since 2024-09-24
 */
public class LinearSearchTest {
    public static void main(String[] args) {
        // Definimos un arreglo de enteros
        int[] nums = {2, 6, 7, 10, 9, 1, 8, 4, 3, 11, 34};
        int value = 11; // Valor a buscar

        // Probar métodos de búsqueda
        System.out.println("Prueba de métodos de búsqueda lineal:");

        // Búsqueda con for i
        int resultFori = findValueFori(nums, value);
        printResult(value, resultFori);

        // Búsqueda con forEach
        int resultForEach = findValueForEach(nums, value);
        printResult(value, resultForEach);

        // Búsqueda con while
        int resultWhile = findValueWhile(nums, value);
        printResult(value, resultWhile);
    }

    // Método auxiliar para imprimir resultados
    private static void printResult(int value, int result) {
        if (result != -1) { // Si es diferente de -1, el valor fue encontrado
            System.out.printf("El elemento %d se encuentra en la posición: %d%n", value, result);
        } else { // De lo contrario
            System.out.printf("El elemento %d no fue encontrado.%n", value);
        }
    }
}

