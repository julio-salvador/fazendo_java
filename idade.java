import java.util.Scanner;

public class idade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
    
        int idade = scanner.nextInt();
       
        if (idade <= 12) {
            System.out.println("Você é criança, betinha!");
        }
        else if (idade <= 17) {
            System.out.println("Você é adolescente, beta!");
        }
        else if (idade <= 59) {
            System.out.println("Você é adulto, betão!");
        }
        else{
            System.out.println("Você é idoso, pegue seu INSS!");
        }
        

    }
}
   

