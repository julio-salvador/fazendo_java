import java.util.Scanner;

public class semaforo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a cor do Semáforo:");
        String cor = scanner.nextLine();
        String corMaiuscula = cor.toUpperCase();

        if (corMaiuscula.equals("VERMELHO")) {
            System.out.println("Pare o carro imediatamente!");
        }
        else if (corMaiuscula.equals("AMARELO")) {
            System.out.println("Prepare-se para parar!");
        }
        else if (corMaiuscula.equals("VERDE")) {
            System.out.println("Siga o seu caminho.");
        }
        else {
            System.out.println("Tem essa cor naum, cê ta bêbado?");
        }
    

    }
}