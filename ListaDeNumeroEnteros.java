import java.util.*;
import java.util.stream.*;

public class ListaDeNumeroEnteros{
    public static void main(String[] args){
       List<Integer> numeros = Arrays.asList(5, 2, 8, 3, 10, 4, 7, 6, 1, 9);

    int resultado = numeros.stream()
                               .filter(n -> n % 2 == 0)   // 1️.Para Filtrar solo los pares
                               .sorted()                  // 2️.Para Ordenar ascendentemente
                               .map(n -> n * n)           // 3️.Para Elevar al cuadrado
                               .mapToInt(Integer::intValue) // Convertir a IntStream
                               .sum();                    // 4️.Para Calcular la suma total

       
        System.out.println("La suma total de los cuadrados pares es: " + resultado);
        
        System.out.println("Fin del programa.");
 }
} 
