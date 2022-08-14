package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("varam", "chandu", "thrilokya");

		list.sort((e1, e2) -> e1.compareTo(e2)); // ascending order
		list.sort((e1, e2) -> e2.compareTo(e1)); // descending order

		Collections.sort(list); // ascending order
		Collections.sort(list, Collections.reverseOrder()); // descending order
		Collections.sort(list, (e1, e2) -> e2.compareTo(e1)); // descending order

		System.out.println(list);

		/*********************************************/

		List<Employee> empList = Arrays.asList(new Employee("chandu", 50000L), new Employee("varam", 40000L),
				new Employee("thrilokya", 40000L));
		// sort by name, if name is same sort by salary
		Collections.sort(empList, Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
		Comparator<Employee> nameComparator = (e1, e2) -> {
			if (e1.getName().compareTo(e2.getName()) == 0) {
				return e1.getSalary() > e2.getSalary() ? 1 : (e1.getSalary() < e2.getSalary() ? -1 : 0);
			} else {
				return e1.getName().compareTo(e2.getName());
			}
		};
		Collections.sort(empList, nameComparator);
		System.out.println(empList);

		/**********************************************/

		empList.stream().map(Employee::getSalary).reduce((accum, salary) -> accum + salary)
				.ifPresent(System.out::println);
		
		Long total = empList.stream().collect(Collectors.summingLong(Employee::getSalary));
		System.out.println("Total salary:" + total);
		System.out.println("Total employees: " + empList.stream().count());
		
		System.out.println("Grouping: "+empList.stream().collect(Collectors.groupingBy(emp -> emp.getName())));
		System.out.println("List to Map:" + empList.stream().collect(Collectors.toMap(Employee::getName, Function.identity())));
		System.out.println("Flat Map:" + empList.stream().flatMap(emp -> Stream.of(emp.getName())).toList());
		
		List<Integer> even = Arrays.asList(2,4,6,8,10);
		List<Integer> odd = Arrays.asList(11,3,5,7,9);
		List<List<Integer>> both = Arrays.asList(even, odd);
		System.out.println("before flat map:"+ both);
		System.out.println("after flat Map:" + both.stream().flatMap(each -> each.stream()).toList());
		
		empList = empList.stream().filter((emp) -> {
			return emp.getSalary() == 40000L;
		}).collect(Collectors.toList());

	}
}

class Employee {
	String name;
	Long salary;

	public Employee(String name, Long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}