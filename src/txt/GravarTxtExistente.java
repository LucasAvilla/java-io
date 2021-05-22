package txt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a grava��o de arquivos TXT, se o arquivo for
 * existente, manter o conte�do, caso n�o exista criar� um novo arquivo.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 8 de mar. de 2021
 * @version 1.0
 */

public class GravarTxtExistente {

	// M�todo para criar TXT recebendo o nome
	public void gravarArquivo(String nome) {

		// classe auxiliar para carregar um arquivo existente ou criar um novo arquivo
		File arquivo = new File(nome);

		try {
			FileOutputStream arquivoOutput = new FileOutputStream(arquivo, true);//true (n�o sobrescreve) - false (sobrescreve)

			// classe auxiliar para gerar o arquivo e o seu conteudo
			PrintStream gravador = new PrintStream(arquivoOutput);

			// gravando o conteudo do arquivo
			gravador.println("FileOutputStream");
			gravador.println("Utilizando o FileOutputStream � poss�vel");
			gravador.println("abrir um arquivo e gravar dados");
			gravador.println("sem necessariamente sobrescrever o arquivo existente.");
			gravador.println("");
			gravador.println("Nesse exemplo al�m de fechar o objeto gravador com m�todo close(),");
			gravador.println("tamb�m � necess�rio fechar o arquivoOutput.");
			// m�todo obrigat�rio para encerrar a grava��o do conteudo
			gravador.close();
			arquivoOutput.close();

			// Exibindo o resultado para o usuario
			JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso!", "Grava��o de Arquivo", 1);
			// Encerrando a execu��o
			System.exit(0);

			// Exibindo o resultado para o usuario
			JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso!", "Grava��o de Arquivo", 1);
			// Encerrando a execu��o
			System.exit(0);

		} catch (FileNotFoundException e) {
			// Exibindo uma mensagem de erro para o usuario
			JOptionPane.showMessageDialog(null, e.toString(), "Grava��o de Arquivo", 0);// e - exibe o erro
			e.printStackTrace();
		} catch (IOException e) {
			// Exibindo uma mensagem de erro para o usuario
			JOptionPane.showMessageDialog(null, e.toString(), "Grava��o de Arquivo", 0);// e - exibe o erro
			e.printStackTrace();

		}

	}// fim do m�todo

	public static void main(String[] args) {
		new GravarTxtExistente().gravarArquivo("saida.txt");
	}
}// fim da classe
