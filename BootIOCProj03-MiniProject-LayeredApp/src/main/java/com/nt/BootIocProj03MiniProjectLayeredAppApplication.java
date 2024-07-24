package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.EmployeeOperationController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootIocProj03MiniProjectLayeredAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(BootIocProj03MiniProjectLayeredAppApplication.class, args);
		EmployeeOperationController controller = ctx.getBean("empController",EmployeeOperationController.class);
		try {
			List<Employee> list = controller.getEmployeesByDesgs("Clerk","Manager", "SalesMan");
			list.forEach(emp->{
				System.out.println(emp);
			});
		}
		catch(Exception e) { 
			e.printStackTrace();
		}
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
