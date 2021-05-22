/**
 * 
 */
package txt;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a grava��o de arquivos TXT, considerando o processo
 * abaixo sempre criar� um novo arquivo, sobrescrevendo o anterior
 * 
 * @author Lucas Igor A M Nogueira
 * @since 5 de mar. de 2021
 * @version 1.0
 */
public class GravarNovoTXT {
	
	//M�todo para gerar um arquivo TXT
	public void gerarArquivoTxt(String nome) {
		
		//classe auxiliar para gerar um arquivo e seu conteudo (java5 em diante)
		try {
			//o objeto gravador possui o m�todo print para escrita de conte�do do arquivo
			PrintStream gravador = new PrintStream(nome);
			gravador.println("PrintStream");
			gravador.println("A classe PrintStream possui um construtor que j�");
			gravador.println("recebe o nome de arquivo como argumento.");
			gravador.println("");
			gravador.println("� importante lebrar que o arquivo de sa�da");
			gravador.println("DEVE SER FECHADO usando o m�todo close().");
			//m�todo obrigat�rio para encerrar a grava��o do conteudo
			gravador.close();
			//Exibindo o resultado para o usuario
			JOptionPane.showMessageDialog(null,"Arquivo gravado com sucesso!", "Grava��o de Arquivo", 1);
			//Encerrando a execu��o
			System.exit(0);
			
		} catch (FileNotFoundException e) {
			// Exibindo uma mensagem de erro para o usuario
			JOptionPane.showMessageDialog(null, e.toString(), "Grava��o de Arquivo", 0);//e - exibe o erro
			e.printStackTrace();
		}
		
		
	}//fim do m�todo

	public static void main(String[] args) {
		new GravarNovoTXT().gerarArquivoTxt("saida.txt");
	}
	
}//fim da classe
