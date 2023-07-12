import employee_persistence.EmployeeRepository;
import employee_status_report.EmployeeStatusReport;
import employee_status_report.EmployeeStatusReportPrinter;
import employee_status_report_creation.StatusReportFactory;
import printer.Printer;

public class Main {

    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository(
                "./src/employees.txt"
        );

        StatusReportFactory factory = new StatusReportFactory();

        EmployeeStatusReport report = factory.createStatusReport(
                repository.getEmployees()
        );

        EmployeeStatusReportPrinter printer =
                new EmployeeStatusReportPrinter(new Printer());

        printer.printStatusReport(report);
    }
}
