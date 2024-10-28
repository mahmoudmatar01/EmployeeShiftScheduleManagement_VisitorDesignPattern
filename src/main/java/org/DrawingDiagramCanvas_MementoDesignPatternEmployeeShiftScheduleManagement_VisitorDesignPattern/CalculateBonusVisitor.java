package org.DrawingDiagramCanvas_MementoDesignPatternEmployeeShiftScheduleManagement_VisitorDesignPattern;

public class CalculateBonusVisitor implements ShiftScheduleManagementVisitor {

    @Override
    public void visit(DayShiftScheduleManagement dayShiftScheduleManagement) {
        System.out.println("Calculating bonus for day shift schedule");
    }

    @Override
    public void visit(NightShiftScheduleManagement nightShiftScheduleManagement) {
        System.out.println("Calculating bonus for night shift schedule");
    }

    @Override
    public void visit(RemoteShiftScheduleManagement remoteShiftScheduleManagement) {
        System.out.println("Calculating bonus for remote shift schedule");
    }
}
