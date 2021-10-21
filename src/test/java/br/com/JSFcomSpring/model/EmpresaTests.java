package br.com.JSFcomSpring.model;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmpresaTests {

	@Test
	public void criar() {
		Empresa emp = new Empresa("BIG MAC", true);
		
		System.out.println(emp);
	}
	
}
