package br.com.JSFcomSpring.JSFcomSpring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.JSFcomSpring.JSFcomSpring.model.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

	@Query(value = "Select u FROM Empresa u")
	List<Empresa> mostrarListar(String nome);

}
