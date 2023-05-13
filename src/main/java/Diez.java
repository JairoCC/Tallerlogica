import java.util.Scanner;

public class Diez {
    public static void main(String[] args) {
        System.out.println("--------- Primera Figura ---------");
        for (int i = 1; i <= 20; i++) {
            if (i <= 10) {
                if (i % 2 != 0) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
        }
        for (int i = 2; i <= 10; i++) {
            if (i % 2 != 0) {
                for (int j = 9 - i; j >= 0; j--) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        System.out.println("--------- Segunda Figura ---------");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                for (int j = 9 - i; j >= 0; j--) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        for (int i = 2; i <= 20; i++) {
            if (i <= 10) {
                if (i % 2 != 0) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
        }
        System.out.println("--------- Tercer Figura ---------");
        Scanner escaner = new Scanner(System.in);
        System.out.println("ingesa número de filas:");
        int filas = escaner.nextInt();
        for (int i = 1; i <= filas+1; i++) {
                for (int j = filas - i; j >= 0; j--) {
                    System.out.print("*");
                }
                System.out.println("");

        }
    }
}


