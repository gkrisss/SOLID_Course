package employee;

public class TimeOffStats {

    private double sickLeaveLeft;
    private double paidLeaveLeft;
    private double unpaidLeaveLeft;

    public TimeOffStats(
            double sickLeaveLeft,
            double paidLeaveLeft,
            double unpaidLeaveLeft
    ) {
        this.sickLeaveLeft = sickLeaveLeft;
        this.paidLeaveLeft = paidLeaveLeft;
        this.unpaidLeaveLeft = unpaidLeaveLeft;
    }

    public double getSickLeaveLeft() {
        return sickLeaveLeft;
    }

    public double getPaidLeaveLeft() {
        return paidLeaveLeft;
    }

    public double getUnpaidLeaveLeft() {
        return unpaidLeaveLeft;
    }
}
