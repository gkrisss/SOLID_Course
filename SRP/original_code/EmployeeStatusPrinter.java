import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeStatusPrinter {

    public EmployeeStatusPrinter() {
        createEmployeeStatusReport();
    }

    public void createEmployeeStatusReport() {
        List<String> employeeData = readEmployeeData("./src/employees.txt");

        printLine(new Date().toString());

        for (String singleEmployeeData : employeeData) {
            String[] fields = singleEmployeeData.trim().split(" ");

            printEmployeeStatusReport(
                fields[0],
                fields[1],
                Double.parseDouble(fields[2]),
                Double.parseDouble(fields[3]),
                Double.parseDouble(fields[4]),
                Double.parseDouble(fields[5]),
                Double.parseDouble(fields[6])
            );
        }
    }

    private List<String> readEmployeeData(String filename) {
        List<String> employeeData = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = reader.readLine()) != null) {
                employeeData.add(line);
            }

            reader.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return employeeData;
    }

    public void printEmployeeStatusReport(
            String employeeName,
            String employeeSurname,
            double contractedHours,
            double workedHours,
            double sickLeaveLeft,
            double paidLeaveLeft,
            double unpaidLeaveLeft
    ) {
        printLine(String.format(
                "%s %s %f %f %f %f %f",
                employeeName,
                employeeSurname,
                contractedHours,
                workedHours,
                sickLeaveLeft,
                paidLeaveLeft,
                unpaidLeaveLeft
        ));
    }

    private void printLine(String line) {
        System.out.println(line);
    }
}
