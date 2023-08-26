package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();
		System.out.println("How many employees will be registered? ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println("Employee #" + (i + 1) + ": ");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while(hasId(list,id)) {
				System.out.println("Id already taken.\nTry again:  ");
				System.out.print("Id: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			// limpar o buffer
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			// instancia um novo objeto com atributos do funcionario
			Employee emp = new Employee(id, name, salary);

			// adiciona na lista o objeto emp acima
			list.add(emp);
		}

		System.out.println("Enter the ID of the employee who will receive a salary increase");
		int idSalary = sc.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

		// Integer pos = idPosition(list, idSalary);

		if (emp == null) {
			System.out.println("This Id does not exist");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}

		System.out.println();
		System.out.println("List of Employees: ");
		// pra cada employee emp na list
		for (Employee e : list) {
			System.out.println(e);
		}
		sc.close();
	}

	/*
	 * public static Integer
	 * idPosition(List<Employee> list, int id) { for (int i = 0; i < list.size();
	 * i++) { if (list.get(i).getId() == id) { return i; } } return null; }
	 */

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
