public class filme {
    public static void main(String[] args) {
    
        System.out.println("Bem vindos ao filmeLoguia");
        System.out.println("filme: Carros");

        int anoLancamento = 2006; // Evite usar caracteres especiais como ç em nomes de variáveis

        System.out.println("Ano lançamento: " + anoLancamento);

        boolean incluidoPlano = true;
        double notaFilme = 7.3;

        // Média calculada pelas notas: minha, pessoal e eu de novo
        double media = (6.6 + 9.5 + 10) / 3;

        System.out.println("A média que o segundo TEC: " + media);

        String sinopse;
        sinopse = """
                Filme: Carros (2006)
                Feito pela Pixar
                O filmaço tem nota: 7.3 (Deveria ser 10)
                Foi lançado em: 
                """ + anoLancamento;

        System.out.println(sinopse);
    }
}