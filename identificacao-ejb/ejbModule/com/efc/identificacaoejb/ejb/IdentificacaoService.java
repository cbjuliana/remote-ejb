package com.efc.identificacaoejb.ejb;

import javax.ejb.Stateless;

import com.efc.identificacaoejb.domain.Pessoa;
import com.efc.identificacaoejb.interfaces.IdentificacaoServiceEJBRemote;
import com.efc.identificacaoejb.repository.PessoaRepository;

@Stateless
public class IdentificacaoService implements IdentificacaoServiceEJBRemote {

	@Override
	public Pessoa getIdentificacaoPessoal(String cpf) {
		PessoaRepository repository = new PessoaRepository();
		return repository.findPessoa(cpf);
	}

}
