package employee;

public class Employee {

    private String name;
    private String surname;

    private WorkHours workHours;

    private TimeOffStats timeOffStats;

    public Employee(
            String name,
            String surname,
            WorkHours workHours,
            TimeOffStats timeOffStats
    ) {
        this.name = name;
        this.surname = surname;
        this.workHours = workHours;
        this.timeOffStats = timeOffStats;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public WorkHours getWorkHours() {
        return workHours;
    }

    public TimeOffStats getTimeOffStats() {
        return timeOffStats;
    }
}
