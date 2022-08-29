package principal;

import java.util.Scanner;
import estoque.compras;
import estoque.retirada;
import financeiro.contas_a_pagar;
import financeiro.contas_a_receber;

public class principal {

	public static void main(String[] args) {
		
        Scanner principal = new Scanner(System.in);
        String compras;
        System.out.println("Digite o produto que deseja comprar: ");
        compras = principal.next();
        System.out.printf("Produto escolhido: " +compras+"\n\n");
     
        String retirar;
        System.out.println("Digite o produto que deseja retirar: ");
        retirar = principal.next();
        System.out.printf("Produto escolhido: " +retirar+"\n\n");
        
        String pagar_conta;
        System.out.println("Digite a conta em que ira pagar o produto: ");
        pagar_conta = principal.next();
        System.out.printf("Forma de pagamento escolhida: " +pagar_conta+"\n\n");
        
        String receber_conta;
        System.out.println("Digite a conta em que ira receber o pagamento: ");
        receber_conta = principal.next();
        System.out.printf("Forma de recebimento escolhida: " +receber_conta+"\n\n");
        
	}

}
