package com.practice.h2db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.practice.h2db.entities.Employee;
import com.practice.h2db.repositories.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
//		
//		 EmployeeRepository emprepo = context.getBean(EmployeeRepository.class);
//		
//		Employee emp1=new Employee();
//		emp1.setEmpName("Anil");
//		emp1.setEmpSalary(100000);
		
		//Employee save = emprepo.save(emp1);
		//System.out.println(save);
	}

}
