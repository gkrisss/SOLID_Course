package employee_persistence;

import employee.Employee;
import employee.TimeOffStats;
import employee.WorkHours;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    private String employeesFilename;

    public EmployeeRepository(String employeesFilename) {
        this.employeesFilename = employeesFilename;
    }

    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(employeesFilename));
            String line;

            while ((line = reader.readLine()) != null) {
                employees.add(parseEmployee(line));
            }

            reader.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return employees;
    }

    private Employee parseEmployee(String line) {
        String[] fields = line.split(" ");

        return new Employee(
                fields[0],
                fields[1],
                new WorkHours(
                        Double.parseDouble(fields[2]),
                        Double.parseDouble(fields[3])
                ),
                new TimeOffStats(
                        Double.parseDouble(fields[4]),
                        Double.parseDouble(fields[5]),
                        Double.parseDouble(fields[6])
                )
        );
    }
}
