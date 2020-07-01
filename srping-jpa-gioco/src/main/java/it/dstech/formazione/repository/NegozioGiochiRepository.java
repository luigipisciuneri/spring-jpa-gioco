package it.dstech.formazione.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import it.dstech.formazione.model.Categoria;
import it.dstech.formazione.model.NegozioGiochi;


public interface NegozioGiochiRepository extends CrudRepository<NegozioGiochi, Integer>{
	
	
	 @Query(value = "SELECT p FROM NegozioGiochi p WHERE p.titolo LIKE '%' || :keyword || '%'"
			+ " OR p.classificazione_PEGI LIKE '%' || :keyword || '%'"
			+ " OR p.categoria LIKE '%' || :keyword || '%'")
	public List<NegozioGiochi> search(@Param("keyword") String keyword);
	 
	// @Query(value="SELECT p FROM NegozioGiochi p order by titolo asc")
	// public List<NegozioGiochi> oridinaNome();
	 
	 //public List<NegozioGiochi> findByOrderByTitoloDesc();
	 public List<NegozioGiochi> findByTitoloOrderByTitoloAsc(String titolo); 

}
