import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Lionel Messi";
        String tipoConta = "Corrente";
        double saldo = 189.91;
        int opcao = 0;

        System.out.println("____________________________");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("____________________________");

        String menu = """
                ** Digite sua opcao **
                1 - Consulte seu Saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair
                """;

        Scanner leitura = new Scanner (System.in);

        while (opcao !=4 ) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado e " + saldo);
            }   else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("nao ha saldo para relizar transferencia");
                } else {saldo -= valor;
                    System.out.println("Novo saldo atualizado e " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("O saldo atualizado e " + saldo);

            } else if (opcao != 4) {
                System.out.println("Opcao invalida!");

            }

        }
    }
}