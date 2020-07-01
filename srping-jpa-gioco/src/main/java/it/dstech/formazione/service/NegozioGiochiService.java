package it.dstech.formazione.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.dstech.formazione.model.Categoria;
import it.dstech.formazione.model.NegozioGiochi;

import it.dstech.formazione.repository.NegozioGiochiRepository;

@Service
@Transactional
public class NegozioGiochiService {
	@Autowired NegozioGiochiRepository repo;
	
	public void save(NegozioGiochi NegozioGiochi) {
		repo.save(NegozioGiochi);
	}
	
	public List<NegozioGiochi> listAll() {
		return (List<NegozioGiochi>) repo.findAll();
	}
	
	public NegozioGiochi get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

	public List<NegozioGiochi> search(String keyword) {
		return repo.search(keyword);
	}
	
	//////////////////////
	
	 public List<NegozioGiochi> sortByTitoloAsc() {
		 
	        return repo.findByTitoloOrderByTitoloAsc("titolo");
	    }
	 
	
	       
	    
	/* 
	 public List<NegozioGiochi> sortByPrezzoAsc() {
	        return repo.findByPrezzoOrderByPrezzoAsc(10.00);
	    }
	 
	 public List<NegozioGiochi> sortByClassificazionePEGIAsc() {
	        return repo.findByClassificazionePEGIOrderByClassificazionePEGIAsc("classificazione_PEGI");
	    }
*/


	
}
