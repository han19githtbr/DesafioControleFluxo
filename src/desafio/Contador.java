package desafio;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o parâmetro um: ");
        int parametroUm = terminal.nextInt();
        
        System.out.println("Digite o parâmetro dois: ");
        int parametroDois = terminal.nextInt();
    
        try {
            //Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        
        } catch(ParametrosInvalidosException exception) {
	        //Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        	System.out.println(exception.getMessage());
        }

	}


	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
	    int contagem = parametroDois - parametroUm;
	    if (contagem < 0) {
	    	throw new ParametrosInvalidosException();
	    }
	    
	    // realizar o for para imprimir os números com base na variável contagem
	    for (int i = parametroUm; i <= parametroDois; i++) {
	    	System.out.println("Imprimindo o número " + i);
	    }
	}
}
