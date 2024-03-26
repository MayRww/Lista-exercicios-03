import java.util.Scanner;

public class exercicio05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Digite o valor da compra: ");
            double valorCompra = scanner.nextDouble();
    
            Loja loja = new Loja(valorCompra);
    
            
            loja.exibirPrestacoes();
    
            scanner.close();
        }
    }
    