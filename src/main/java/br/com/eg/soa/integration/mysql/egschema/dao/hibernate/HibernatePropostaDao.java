package br.com.eg.soa.integration.mysql.egschema.dao.hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.eg.soa.integration.mysql.egschema.dao.PropostaDao;
import br.com.eg.soa.integration.mysql.egschema.model.Proposta;

@Repository
public class HibernatePropostaDao implements PropostaDao{
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public HibernatePropostaDao(final SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Proposta> listar() {
		return sessionFactory.getCurrentSession().createCriteria(Proposta.class).list();
	}

	@Override
	public Proposta consultar(Long numeroProposta) {
		return (Proposta) sessionFactory.getCurrentSession().createCriteria(Proposta.class).add(Restrictions.eq("id",numeroProposta)).uniqueResult();
	}

	@Override
	public void atualizar(Proposta proposta) {
		sessionFactory.getCurrentSession().update(proposta);
	}

	@Override
	public void criar(Proposta proposta) {
		sessionFactory.getCurrentSession().save(proposta);
	}

}
