package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
		System.out.println(empresa.getNome() + " cadastrada com sucesso");
	}

	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
	
}
