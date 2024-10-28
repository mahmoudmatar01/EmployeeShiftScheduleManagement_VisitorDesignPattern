package org.DrawingDiagramCanvas_MementoDesignPatternEmployeeShiftScheduleManagement_VisitorDesignPattern;

public class NightShiftScheduleManagement implements ShiftScheduleManagement{

    @Override
    public void generateReport() {
        System.out.println("Generating a report for night shift schedule");
    }

    @Override
    public void calculateOverTime() {
        System.out.println("Calculating over time for night shift schedule");
    }

    @Override
    public void acceptVisitor(ShiftScheduleManagementVisitor shiftScheduleManagementVisitor) {
        shiftScheduleManagementVisitor.visit(this);
    }
}
