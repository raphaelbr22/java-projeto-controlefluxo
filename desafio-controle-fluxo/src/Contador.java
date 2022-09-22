import java.util.Scanner;

public class Contador {
	/**
     * <h1>Desafio Controle de fluxo</h1>
     * Projeto Desafio Controle de Fluxo recebe dois números inteiros e imprime os números que se encontram dentro
	 * do intervalo dos valores digitados, mostrando também sua posição dentro da contagem.
     * <p>
     * <b>Nota:</b> Projeto realizado para estudos e entrega do desafio do bootcamp "Formação Java Developer", 
     * na plataforma DIO.
     * 
     * @author Raphael Barbosa Rocha
     * @version 1.0
     * @since 21/09/2022
     * 
     * @param paramentroUm esta é a variável de entrada para definir o número menor
     * @param parametroDois esta é a variável de entrada para definir o número maior
	 * @param contagem determina a quantidade de eventos para execução do método
     * @param contar é o método que verifica se o @param parametroUm é menor que o @param parametroDois 
     */
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try{
		contar(parametroUm, parametroDois);	
		}
		catch(ParametrosInvalidosException exception) {
		
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");

		}
	terminal.close();	
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		
		int contagem = parametroDois - parametroUm;
		
		if(contagem<=0){
			throw new ParametrosInvalidosException();
		}

		for(int contando = 0; contagem >= 0; contagem--){

			System.out.println("Imprimindo o " + (contando+1) + "º numero: " + parametroUm);
			parametroUm++;
			contando++;
		}
	}
}

