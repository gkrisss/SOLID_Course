package employee_status_report_creation;

import employee.Employee;
import employee_status_report.EmployeeStatusReport;

import java.util.Date;
import java.util.List;

public class StatusReportFactory {

    public EmployeeStatusReport createStatusReport(
            List<Employee> employeeData
    ) {
        return new EmployeeStatusReport(
                new Date(),
                employeeData
        );
    }
}
