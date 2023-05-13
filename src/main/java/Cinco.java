import java.util.Scanner;

public class Cinco {
    public static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args) {
        double base=0,altura=0,radio=0;
        System.out.println("\n\n---------------------------");
        System.out.println("1-Area de un cuadrado");
        System.out.println("2-Area de un rectangulo");
        System.out.println("3-Area de un circulo");
        System.out.println("4-Area de un trinagulo");
        System.out.println("Elige una opcion");
        int opcion=entrada.nextInt();
            switch(opcion) {
                case 1:
                    // area de un cuadrado
                    System.out.println("Introduce la base o altura: ");
                    base=entrada.nextDouble();
                    System.out.println("\nEl area del cuadrado es " + (base*base));
                    break;
                case 2:
                    // area de un rectangulo
                    System.out.println("Introduce la base: ");
                    base=entrada.nextDouble();
                    System.out.println("Introduce la altura: ");
                    altura=entrada.nextDouble();
                    System.out.println("\nEl area del rectangulo es " + (base*altura));
                    break;
                case 3:
                    // area de un circulo
                    System.out.println("Introduce el radio: ");
                    radio=entrada.nextDouble();
                    System.out.printf("\nEl area de la circunferencia es %1.2f\n", Math.PI*(Math.pow(radio,2)));
                    break;
                case 4:
                    // area de un triangulo
                    System.out.println("Introduce la base: ");
                    base=entrada.nextDouble();
                    System.out.println("Introduce la altura: ");
                    altura=entrada.nextDouble();
                    System.out.printf("\nEl area del triangulo es %1.2f\n", (base*altura)/2);
                    break;
            }
    }
}
