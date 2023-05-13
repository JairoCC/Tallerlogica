import java.util.Arrays;
import java.util.Scanner;

public class Dos {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Escribe número de personas:");
        int personas = escaner.nextInt();
        int[] ar = new int[personas];
        for (int i = 1; i <= personas; i++){
            System.out.println("Introduce edad de persona " + i + " :");
            int edad = escaner.nextInt();
            ar[i-1]=edad;
        }
        int sum = Arrays.stream(ar).sum();
        double promedio = sum/personas;
        System.out.println("Suma total de edades es " + sum + " y el promedio de edades es " + promedio);
    }
}
