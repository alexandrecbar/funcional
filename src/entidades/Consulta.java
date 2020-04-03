package entidades;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Consulta {

	public Consulta() {

		try {

			Scanner teclado = new Scanner(System.in);
			String[] campos = null;
			char letra;
			Double salario;
			Object[] salarios;
			Double somaSalario = 0.0;
			List<Funcionario> listaFuncionarios = new ArrayList<>();
			System.out.print("Informe o arquivo fonte: ");
			BufferedReader arquivo = new BufferedReader(new FileReader(teclado.nextLine()));
			System.out.println("Informe o salário usado como parametro: ");
			salario = teclado.nextDouble();
			System.out.println("Informe a letra usada como parametro: ");

			letra = Character.toUpperCase(teclado.next().charAt(0));

			teclado.close();
			String linha = arquivo.readLine();

			while (linha != null) {

				campos = linha.split(";");

				listaFuncionarios.add(new Funcionario(campos[0], campos[1], Double.parseDouble(campos[2])));

				linha = arquivo.readLine();

			}

			Collections.sort(listaFuncionarios);

			Stream<Funcionario> listaEmails = listaFuncionarios.stream().filter(a -> a.getSalario() > salario);

			Stream<Funcionario> listaLetra = listaFuncionarios.stream()
					.filter(a -> a.getNome().substring(0, 1).equals(Character.toString(letra)));

			System.out.println("Emails dos funcionarios com salario maior que: " + salario);
			listaEmails.map(a -> a.getEmail()).forEach(System.out::println);

			salarios = listaLetra.map(a -> a.getSalario()).toArray();

			for (int i = 0; i < salarios.length; i++) {

				somaSalario += (Double) salarios[i];

			}

			System.out
					.println("Soma do salário dos funcionarios que comecam com a letra " + letra + ": " + somaSalario);

			arquivo.close();

		} catch (FileNotFoundException e) {

			e.getStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
