package br.com.JSFcomSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.JSFcomSpring.model.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {


}
