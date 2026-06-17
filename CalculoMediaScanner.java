import java.util.Scanner;

public class CalculoMediaScanner {
    public static void main(String[] args) {
        // Criando o objeto scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Leitura das notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Cálculo da média
        double media = (nota1 + nota2 + nota3) / 3;

        // Exibe o resultado final
        System.out.printf("%nMédia final: %.2f%n", media);

        // Aplicação da regra de negócio
        if (media < 4.0) {
            System.out.println("Status: Reprovado. Dedique-se mais no próximo semestre!");
        } else if (media <= 6.0) {
            System.out.println("Status: Recuperação. Ainda dá para recuperar, estude para o exame!");
        } else {
            System.out.println("Status: Aprovado. Parabéns pelo resultado!");
        }

        // Fechando o scanner
        scanner.close();
    }
}-