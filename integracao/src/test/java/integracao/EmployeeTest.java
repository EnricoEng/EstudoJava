package integracao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	Employee employee;


	@Test
	public void testNaoContrataMenorDe16(){

		employee = new Employee();
		employee.setAge(8);
		assertEquals(false, employee.isHirable());
	}

	
	@Test
	public void testContratadoEstagio(){

		employee = new Employee();
		employee.setAge(18);
		assertEquals(true, employee.isHirable());
	}
	
	
	@Test
	public void testContratadaFullTime(){

		employee = new Employee();
		employee.setAge(22);
		assertEquals(true, employee.isHirable());
	}
	
	@Test
	public void testNaoContrataMaiorDe55(){

		employee = new Employee();
		employee.setAge(120);
		assertEquals(false, employee.isHirable());
	}

	
}




	

