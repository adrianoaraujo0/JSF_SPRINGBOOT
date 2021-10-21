package repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.JSFcomSpring.model.Empresa;
import br.com.JSFcomSpring.repository.EmpresaRepository;

@SpringBootTest
public class EmpresaRepositoryTest {
	@Autowired
	EmpresaRepository emp;

	@Test
	public void inserir() {

		Empresa em1 = new Empresa("Burger King", true);
		Empresa em2 = new Empresa("McDonalds", false);

		//empresaRepository.save(em1);
		emp.save(em2);
	}

}
