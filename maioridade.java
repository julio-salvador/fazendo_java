import java.util.Scanner;

public class maioridade {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua idade?" );

        int idade = 12;

        if (idade < 18) {
            System.out.println("Você ainda é café com leite");
        }
        else {
            System.out.println("Você é maiorzinho");
        }

        
        
    }
}
