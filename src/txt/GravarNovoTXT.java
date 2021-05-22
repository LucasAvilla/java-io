/**
 * 
 */
package txt;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a gravação de arquivos TXT, considerando o processo
 * abaixo sempre criará um novo arquivo, sobrescrevendo o anterior
 * 
 * @author Lucas Igor A M Nogueira
 * @since 5 de mar. de 2021
 * @version 1.0
 */
public class GravarNovoTXT {
	
	//Método para gerar um arquivo TXT
	public void gerarArquivoTxt(String nome) {
		
		//classe auxiliar para gerar um arquivo e seu conteudo (java5 em diante)
		try {
			//o objeto gravador possui o método print para escrita de conteúdo do arquivo
			PrintStream gravador = new PrintStream(nome);
			gravador.println("PrintStream");
			gravador.println("A classe PrintStream possui um construtor que já");
			gravador.println("recebe o nome de arquivo como argumento.");
			gravador.println("");
			gravador.println("É importante lebrar que o arquivo de saída");
			gravador.println("DEVE SER FECHADO usando o método close().");
			//método obrigatório para encerrar a gravação do conteudo
			gravador.close();
			//Exibindo o resultado para o usuario
			JOptionPane.showMessageDialog(null,"Arquivo gravado com sucesso!", "Gravação de Arquivo", 1);
			//Encerrando a execução
			System.exit(0);
			
		} catch (FileNotFoundException e) {
			// Exibindo uma mensagem de erro para o usuario
			JOptionPane.showMessageDialog(null, e.toString(), "Gravação de Arquivo", 0);//e - exibe o erro
			e.printStackTrace();
		}
		
		
	}//fim do método

	public static void main(String[] args) {
		new GravarNovoTXT().gerarArquivoTxt("saida.txt");
	}
	
}//fim da classe
