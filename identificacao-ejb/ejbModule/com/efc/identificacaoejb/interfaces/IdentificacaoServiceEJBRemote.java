package com.efc.identificacaoejb.interfaces;

import javax.ejb.Remote;

import com.efc.identificacaoejb.domain.Pessoa;

@Remote
public interface IdentificacaoServiceEJBRemote {
	
	public Pessoa getIdentificacaoPessoal(String cpf);

}
