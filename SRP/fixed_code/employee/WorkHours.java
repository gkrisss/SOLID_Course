package employee;

public class WorkHours {

    private double hoursContracted;
    private double hoursWorked;

    public WorkHours(double hoursContracted, double hoursWorked) {
        this.hoursContracted = hoursContracted;
        this.hoursWorked = hoursWorked;
    }

    public double getHoursContracted() {
        return hoursContracted;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
}
