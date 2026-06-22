import java.util.Scanner;

public class velocidade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua velocidade?" );

        int velo = 79;

        if (velo > 80) {
            System.out.println("Velocidade acima do limite, reduza!" );
        }
        else {
            System.out.println("Velocidade aceita, siga com cuidado!" );
        }


        
    }
}
