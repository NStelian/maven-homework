package ro.itschool.mvnbase.tema10.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainEmployee {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Tom", 20, "black", "Bershka", 2000),
                new Employee("Jim", 34, "red", "Fortech", 2500),
                new Employee("Jack", 54, "brown", "Qubiz", 3000),
                new Employee("Jones", 54, "purple", "KFC", 6000),
                new Employee("Joe", 64, "green", "KFC", 4500)
        );

        System.out.println(salaryBiggerThan(employees, 2500));
        System.out.println(personsFromCompany(employees));
        System.out.println(calculateSalaries(employees));
        System.out.println(biggestSalary(employees));
    }

    public static List<String> salaryBiggerThan(List<Employee> employees, int salaryCompare) {
        List<String> names = new ArrayList<>();
        for (Employee element : employees) {
            if (element.getSalary() > salaryCompare) {
                names.add(element.getName());
            }
        }
        return names;
    }

    public static Map<String, List<String>> personsFromCompany(List<Employee> employees){
        Map<String,List<String>> mapHair = new HashMap<>();
        for (Employee element : employees) {
            List<String> names = mapHair.get(element.getCompany());
            if(names==null){
                names = new ArrayList<>();
                mapHair.put(element.getCompany(),names);
            }
            names.add(element.getName());
        }
        return mapHair;
    }

    public static int calculateSalaries(List<Employee> employees) {
        int sum = 0;
        for (Employee element : employees) {
            sum += element.getSalary();
        }

        return sum;
    }

    public static String biggestSalary(List<Employee> employees) {
        int biggestSalary = 0;
        String company = "";
        for (Employee element : employees) {
            if (element.getSalary() > biggestSalary) {
                biggestSalary = element.getSalary();
                company = element.getCompany();
            }
        }

        return "The biggest salary is " + biggestSalary + " from company " + company;

    }
}
