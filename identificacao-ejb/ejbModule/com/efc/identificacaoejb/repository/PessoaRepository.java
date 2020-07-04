package com.efc.identificacaoejb.repository;

import java.util.ArrayList;
import java.util.List;

import com.efc.identificacaoejb.domain.Pessoa;

public class PessoaRepository {

	List<Pessoa> pessoas;

	public PessoaRepository() {
		pessoas = new ArrayList<Pessoa>();
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("João Batista");
		pessoa1.setCpf("459.784.458-45");

		pessoas.add(pessoa1);

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Maria Batista");
		pessoa2.setCpf("477.584.222-85");

		pessoas.add(pessoa2);
	}
	
	public Pessoa findPessoa(String cpf) {
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				return pessoa;
			}
		}
		return null;
	}

}
