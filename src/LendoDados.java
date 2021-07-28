import java.util.Scanner; 
public class LendoDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome; 
			// cria variável que guarda texto
		
		System.out.println("Por favor, digite o seu nome: "); 
			//exibe uma mensagem 
		
		Scanner	leitor = new Scanner(System.in); 
			//cria um scanner que permite ler dados do teclado
		
		nome = leitor.next(); 
			//lê o texto do usuário 
		
		System.out.println("Boa noite para você, " + nome); 
			//exibe uma mensagem com o conteúdo da variável 
		
		leitor.close(); 
			//fecha o recurso externo (Scanner) 
	}

}
