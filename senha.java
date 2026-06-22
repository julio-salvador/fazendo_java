import java.util.Scanner;

public class senha {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua senha?" );

        int digitado = 1234;
        int senha = 1234;

        if (senha == digitado) {
             System.out.println("Acesso permitido");
        }
        else {
             System.out.println("Acesso negado" );
        }

    
        }
    }

