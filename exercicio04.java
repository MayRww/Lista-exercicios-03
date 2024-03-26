import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Obtendo os dados da conversão
        System.out.println("Digite a cotação do dólar:");
        double cotacaoDolar = scanner.nextDouble();
        
        System.out.println("Digite a quantidade de dólares:");
        double quantidadeDolar = scanner.nextDouble();
        
        // Criando o objeto conversor
        ConversaoDolar conversor = new ConversaoDolar(cotacaoDolar, quantidadeDolar);
        
        // Exibindo as informações da conversão
        conversor.exibirInformacoes();
        
        scanner.close();
    }
}