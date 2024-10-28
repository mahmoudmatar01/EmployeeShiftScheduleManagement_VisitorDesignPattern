package org.DrawingDiagramCanvas_MementoDesignPatternEmployeeShiftScheduleManagement_VisitorDesignPattern;

public interface ShiftScheduleManagement {
    void generateReport();
    void calculateOverTime();
    void acceptVisitor(ShiftScheduleManagementVisitor shiftScheduleManagementVisitor);
}
