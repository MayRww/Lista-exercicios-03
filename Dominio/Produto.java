package Dominio;
public class Produto {
        private double precoCusto;
        private double percentualAcrescimo;

        public Produto(double precoCusto, double percentualAcrescimo) {
            this.precoCusto = precoCusto;
            this.percentualAcrescimo = percentualAcrescimo;
        }
    
        public double calcularValorVenda() {
            return precoCusto * (1 + percentualAcrescimo / 100);
        }
    
        public void exibirValorVenda() {
            double valorVenda = calcularValorVenda();
            System.out.println("O valor de venda do produto é: R$" + valorVenda);
        }
    }

