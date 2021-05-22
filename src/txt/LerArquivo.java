package txt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a leitura de arquivo txt
 * 
 * @author Lucas Igor A M Nogueira
 * @since 5 de mar. de 2021
 * @version 1.0
 */

public class LerArquivo {

	/*
	 * Método para ler um arquivo recebendo o seu nome
	 */
	public void lerArquivo(String nome) {

		try {
			// declara um atributo para ler o arquivo e informar o nome para leitura
			Scanner leitor = new Scanner(new FileReader(nome));

			// laço de repetição para leitura do arquivo com o comando hasNext
			while (leitor.hasNext()) {
				// Exibindo no console o conteudo armazenado no arquivo TXT
				System.out.println(leitor.nextLine());// usar Sysout devito estar dentro de um laço de repetição.
														// next(com quebra),nextline(linha por linha)

			}

		} catch (FileNotFoundException e) {
			// Exibindo uma mensagem de erro para o usuario
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "Ler Arquivo", 0);
			// Exibe o log de erro do java no console
			e.printStackTrace();
		}

	}// fim do metodo

	// Método principal para executar a classe
	public static void main(String[] args) {

		new LerArquivo().lerArquivo("entrada.txt");
	}
}// fim da classe
