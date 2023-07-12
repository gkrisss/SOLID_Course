package employee_status_report;

import employee.Employee;
import printer.Printer;

public class EmployeeStatusReportPrinter {

    private Printer printer;

    public EmployeeStatusReportPrinter(Printer printer) {
        this.printer = printer;
    }

    public void printStatusReport(EmployeeStatusReport report) {
        printer.printLine(report.getFormationDate().toString());

        for (Employee employee: report.getEmployeeData()) {
            printer.printLine(String.format(
                    "%s %s %f %f %f %f %f",
                    employee.getName(),
                    employee.getSurname(),
                    employee.getWorkHours().getHoursContracted(),
                    employee.getWorkHours().getHoursWorked(),
                    employee.getTimeOffStats().getSickLeaveLeft(),
                    employee.getTimeOffStats().getPaidLeaveLeft(),
                    employee.getTimeOffStats().getUnpaidLeaveLeft()
            ));
        }
    }
}
