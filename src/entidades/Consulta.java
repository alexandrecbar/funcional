package entidades;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Consulta {

	public Consulta() {

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

			

			System.out.println(listaFuncionarios.size());
//			listaFuncionarios.forEach(System.out::println);

//			Stream<Funcionario> listaFuncionariosFiltrada = listaFuncionarios.stream();
//			listaFuncionariosFiltrada.sorted((a,b) -> a.compareTo(b));
//			listaFuncionariosFiltrada.forEach(System.out::println);

			arquivo.close();

		} catch (FileNotFoundException e) {

			e.getStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
