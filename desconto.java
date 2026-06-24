import java.util.Scanner;

public class desconto {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra:" );

        double tot_compra = scanner.nextDouble();

        double desconto = 0;

        if (tot_compra > 200 ) {
            System.out.println("Receba o descontin de 10%" );
        }
        else if (tot_compra > 100 ) {
            System.out.println("Receba o descontin de 20%" );
        }
        else {
            System.out.println("Receba o valor sem descontin." );
        }
    }
}
