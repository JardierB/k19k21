package br.com.wood.k21.main;

import java.util.Calendar;

import br.com.wood.k21.persistence.dao.FaturaDAO;
import br.com.wood.k21.persistence.dao.LigacaoDAO;
import br.com.wood.k21.persistence.dao.impl.FaturaDAOImpl;
import br.com.wood.k21.persistence.dao.impl.LigacaoDAOImpl;
import br.com.wood.k21.persistencia.entity.Fatura;
import br.com.wood.k21.persistencia.entity.Ligacao;

public class FaturaLigacao {
	public static void main(String[] args) {
		LigacaoDAO ligacaoDAO = new LigacaoDAOImpl();
		FaturaDAO faturaDAO = new FaturaDAOImpl();

		Fatura f = new Fatura();
		f.setNumero("00120");
		f.setData(Calendar.getInstance());
		f = faturaDAO.save(f);
		
		Ligacao l1 = new Ligacao();
		l1.setDuracao(10);
		l1.setDestino("Bahia");
		l1.setFatura(f);
		l1 = ligacaoDAO.save(l1);

		Ligacao l2 = new Ligacao();
		l2.setDuracao(15);
		l2.setDestino("Paris");
		l2.setFatura(f);
		l2 = ligacaoDAO.save(l2);

	
		
	}

}
