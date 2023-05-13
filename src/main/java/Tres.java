import java.util.concurrent.TimeUnit;

public class Tres {
    public static void main(String args[]) throws InterruptedException {
        int hora = 0;
        int minuto = 0;
        int segundo;
        String borraAnterior = "\b\b\b\b\b\b\b\b";

            for (minuto=0; minuto<=59; minuto++) {
                // segundos

                    for (segundo=0; segundo<=59; segundo++) {
                        if(minuto == 1){
                            break;
                        }
                        System.out.printf("%02d:%02d:%02d",hora,minuto,segundo);
                        TimeUnit.SECONDS.sleep(1);
                        System.out.print(borraAnterior);
                    }
                if(minuto == 1){
                    break;
                }

            }

    }
}
