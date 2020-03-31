package entidades;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Instancia {

	public Instancia() {

		try {

			Scanner teclado = new Scanner(System.in);
			String[] campos = null;
			List<Funcionario> listaFuncionarios = new ArrayList<>();
			System.out.print("Informe o arquivo fonte: ");
			BufferedReader arquivo = new BufferedReader(new FileReader(teclado.nextLine()));
			teclado.close();
			String linha = arquivo.readLine();

			while (linha != null) {

				campos = linha.split(";");

				listaFuncionarios.add(new Funcionario(campos[0], campos[1], Double.parseDouble(campos[2])));

				linha = arquivo.readLine();

			}

			for (Funcionario funcionario : listaFuncionarios) {
				
				System.out.println("Nome: " +  funcionario.getNome() + " Email: " + funcionario.getEmail() + " Salario: " + funcionario.getSalario());
				
			}
			
			//listaFuncionarios.stream().forEach(System.out::println);
			
			arquivo.close();

		} catch (FileNotFoundException e) {

			e.getStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
