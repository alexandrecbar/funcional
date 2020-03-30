package entidades;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class instancia {

	public instancia() {

		
		
		try {
			Scanner teclado = new Scanner(System.in);
			String[] campos;
			BufferedReader arquivo = new BufferedReader(new FileReader(teclado.nextLine()));
			String linha = arquivo.readLine();
						
			while (linha != null) {
				
				campos = linha.split(";");
				
				arquivo.readLine();
				
				
			}
			for (String campo : campos) {

				System.out.println(campos);

			}

		} catch (FileNotFoundException e) {

			e.getStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
