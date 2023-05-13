
public class Nueve {
    public static void main(String[] args) {

        int x = 8; // Múltiplo
        for (int i=1; i <= 500; i++) {

            if (i % x == 0)
                System.out.println(i);
        }
        System.out.println("Lo sentimos, no existe un número 500 que sea múltiplo de 8");
    }
}
