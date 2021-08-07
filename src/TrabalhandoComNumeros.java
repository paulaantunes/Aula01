import java.util.Scanner;	
public class TrabalhandoComNumeros {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int valor1; 
		int valor2; 
		int soma; 
		int subtrai; 
		int multiplica; 
		double dividi;
		
		System.out.println("Programa Calculadora");
		System.out.println("Por favor, informe o primeiro valor:");
		valor1 = leitor.nextInt(); 
		
		System.out.println("Por favor, informe o segundo valor:");
		valor2 = leitor.nextInt(); 
		
		soma = valor1 + valor2; 
		subtrai = valor1 - valor2; 
		multiplica = valor1 * valor2; 
		dividi = valor1 / (double) valor2; 
		
		System.out.println("A soma dos valores é " + soma);
		System.out.println("A subtração dos valores é " + subtrai); 
		System.out.println("A multiplicação dos valores é " + multiplica);
		System.out.println("A divisão dos valores é " + dividi);
		
		leitor.close();

		/* + soma
		 * - subtração
		 * * multiplicação
		 * / divisão
		 */
	}

}
