import java.util.Scanner;

public class maioridade {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua idade?" );

        int idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("Você ainda é café com leite, seu badernista19!");
        }
        else {
            System.out.println("Você é maiorzinho, já pode ser preso.");
        }

        
        
    }
}
