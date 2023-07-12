package employee_status_report;

import employee.Employee;

import java.util.Date;
import java.util.List;

public class EmployeeStatusReport {

    private Date formationDate;

    private List<Employee> employeeData;

    public EmployeeStatusReport(
            Date formationDate,
            List<Employee> employeeData
    ) {
        this.formationDate = formationDate;
        this.employeeData = employeeData;
    }

    public Date getFormationDate() {
        return formationDate;
    }

    public List<Employee> getEmployeeData() {
        return employeeData;
    }
}
