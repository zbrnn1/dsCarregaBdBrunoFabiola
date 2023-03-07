package carregabanco.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

import carregabanco.model.PessoaModel;

public class CarregaBancoController {
	private static ArrayList<PessoaModel> valores = new ArrayList<PessoaModel>();

	public ArrayList<PessoaModel> loader(String file) {
		try {
			Reader reader = new InputStreamReader(new FileInputStream("src/main/resources/" + file), "UTF-8");
			BufferedReader bf = new BufferedReader(reader);
			String linha = bf.readLine();
			while (linha != null) {
				String[] data = linha.split(",");
				PessoaModel pessoa = new PessoaModel();
				pessoa.setCampus(data[0]);
				pessoa.setNomePessoa(data[4]);
				valores.add(pessoa);
				linha = bf.readLine();
			}
		} catch (Exception e) {
			System.out.println("Erro" + e.getMessage());
		}
		return valores;
	}
}
