import java.util.Scanner;

public class senha {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua senha:" );

        int digitado = scanner.nextInt();
        int senha = 1234;

        if (senha == digitado) {
             System.out.println("Acesso permitido, tenha um bom dia.");
        }
        else {
             System.out.println("Acesso negado, vaza tonhão!" );
        }

    
        }
    }

