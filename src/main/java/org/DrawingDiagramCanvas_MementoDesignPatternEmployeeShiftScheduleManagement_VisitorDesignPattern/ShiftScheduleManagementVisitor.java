package org.DrawingDiagramCanvas_MementoDesignPatternEmployeeShiftScheduleManagement_VisitorDesignPattern;

public interface ShiftScheduleManagementVisitor {
    void visit(DayShiftScheduleManagement dayShiftScheduleManagement);
    void visit(NightShiftScheduleManagement nightShiftScheduleManagement);
    void visit(RemoteShiftScheduleManagement remoteShiftScheduleManagement);
}
